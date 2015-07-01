public class ReverseArrByStack{
	public static void  main(String []args){
		int [] arr = {1,2,3};
		int len = arr.length;
		LocalStack stack = new LocalStack(len);
		for(int i =0;i<len;i++){
			System.out.println(arr[i]);
			if(!stack.isFull()){
				stack.push(arr[i]);
			}
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop());	
		}

	}
}

class LocalStack{
	private int buffer[];
	private int top;
	private int maxSize;
	public LocalStack(){
		this.maxSize = 10;
		buffer = new int[this.maxSize];
		top=-1;
	}
	public LocalStack(int size){
		this.maxSize = size;
		buffer = new int[this.maxSize];
		top = -1;
	}
	public void push(int i){
		buffer[++top] = i;
	}
	public int pop(){
		return buffer[top--];
	}
	public boolean isFull(){
		return top == maxSize-1;
	}
	public boolean isEmpty(){
		return top == -1;
	}
}
