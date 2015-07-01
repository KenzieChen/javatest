class Runner implements Runnable{
	private int i;
	public void run(){
		for(;i<20;i++){
			System.out.println(Thread.currentThread()+"-"+i);
		}
	}
}
public class SecondThread{
	public static void main(String[] args){
		for(int i = 0; i<200;i++){
			System.out.println(Thread.currentThread()+"-"+i);
			if(i==20){
				Runner r = new Runner();
				Thread t1 =new Thread(r);
				Thread t2 =new Thread(r);
				t1.start();
				t2.start();
			}
		}
	}
}
