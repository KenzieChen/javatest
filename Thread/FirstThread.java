public class FirstThread extends Thread{
	private int i;
	public void run(){
		for(;i<50;i++){
			System.out.println(this.getName()+"-"+i);
		}
	} 
	public static void main(String[] args){
		for(int i=0;i<200;i++){
			System.out.println(Thread.currentThread()+"-"+i);
			if(i==20){
				new FirstThread().start();
				new FirstThread().start();
			}
		}
	}
}