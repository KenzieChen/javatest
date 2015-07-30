class Node{
	int val;
	Node next;
	public Node(){}
	public Node(int val){
		this.val = val;
	}
}

public class CheckCycle{
	public static void main(String[] args){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		//head.next.next.next = head.next;
		System.out.println(check(head));
	}
	public static boolean check(Node head){
		Node slow = head;
		Node fast = head;
		while(fast !=null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) return true;
		}
		return false;
	}
}
