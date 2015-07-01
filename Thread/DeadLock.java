public class DeadLock{
	public static void main(String[] args){
		Res r1 = new Res("r1");
		Res r2 = new Res("r2");		
		//Runnable run1 = new DeadThread(r1,r2);
		//Runnable run2 = new DeadThread(r2,r1);
		new DeadThread(r1,r2).start();
		new DeadThread(r2,r1).start();
	}
}
class Res {
	private String name;
	public Res(){};
	public Res(String name){
		this.name = name;
	};
	public String toString(){
			return name;
	};

}
class DeadThread extends Thread{
	private Res r1,r2;
	public DeadThread(){
	}
	public DeadThread(Res r1,Res r2){
		this.r1 = r1;
		this.r2 = r2;
	}
	public void run(){
		synchronized(r1){
			System.out.println(Thread.currentThread().getName()+"获得了"+r1);
		
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
			}
			synchronized(r2){
				System.out.println(Thread.currentThread().getName()+"获得了"+r2);
			}
		}
	}
}

