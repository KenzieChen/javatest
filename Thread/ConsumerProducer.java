import java.util.LinkedList;
class Bag{
	private LinkedList<Object> buffer = new LinkedList<Object>();
	private int max;
	public Bag(int max){
		this.max = max;
	}
	public void consume(){
		synchronized(buffer){
			while(buffer.size()<1){
				try{
					buffer.wait(1000);
				}catch(InterruptedException e){
				}
			}
				buffer.poll();
				System.out.println(Thread.currentThread().getName()+"消费了1个,剩余"+buffer.size());
				buffer.notifyAll();

		}
	}

	public void produce(){
		synchronized(buffer){
			while(buffer.size()==this.max){
				try{
					buffer.wait(1000);
				}catch(InterruptedException e){
					
				}
			}
				buffer.push(new Object());
				System.out.println(Thread.currentThread().getName()+"生产了1个,剩余"+buffer.size());
				buffer.notifyAll();

		}
	}

}
class Consumer extends Thread{
	private Bag bag;
	public Consumer(Bag bag){
		this.bag = bag;
	}	
	public void run(){
		while(true){
			consume();
		}
	}
	public void consume(){
		bag.consume();
	}
}
class Producer extends Thread{
	private Bag bag;
	public Producer(Bag bag){
		this.bag =bag;
	}
	public void run(){
		while(true){
			produce();
		}
	}
	public void produce(){
		bag.produce();
	}
}
public class ConsumerProducer{
	public static void main(String[] args){
		Bag bag = new Bag(10); 
		Consumer c1 = new Consumer(bag);
		Consumer c2 = new Consumer(bag);
		Consumer c3 = new Consumer(bag);
		Producer p1= new Producer(bag);
		Producer p2= new Producer(bag);
		Producer p3= new Producer(bag);
		Producer p4= new Producer(bag);
		c1.start();
		c2.start();
		c3.start();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
	}
}
