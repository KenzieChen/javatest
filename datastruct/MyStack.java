public class MyStack{
	private Node top;
	public void push(Object item){
		Node n = new Node(item);	
		top.next = top;
		top = n;
	}
	public Object pop(){
		if(top != null){
			Object item = top.data;
			top=top.next;
			return item;
		}
		return null;
	}
	public Object peek(){
		if(top !=null)
			return top.data;
		return null;
	}
	public static void main(String[] args){
		MyStack stack = new MyStack();
		Object item =stack.peek();
		System.out.println(item);
	}	
}
class Node{
	public Object data;
	public Node next;
       	public Node(){}
	public Node(Object data){
		this.data = data;
	}

}
