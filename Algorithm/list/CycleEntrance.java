class Node{
	int val;
	Node next;
	public Node(){}
	public Node(int val){
		this.val = val;
	}
}

//假设该链表一定有环
//那么假设链表头结点到环入口距离为a，快指针和慢指针第一次相遇点距离换入口为b
//环的周长为L，则有2(a+b) = a+b+n*L,n为快指针走的圈数，得出 n*L = a+b，但快慢指针遇到的时候，让快指针回到链表头结点，使他和慢指针一样一步一步走，当它走到他们俩第一次相遇的地方的时候，慢指针也走到这里。而在此之前一定会首先一直走到换入口点。
public class CycleEntrance{
	public static void main(String[] args){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = head.next;
		System.out.println(findCycleEntrance(head).val);
	}
	public static Node findCycleEntrance(Node head){
		Node slow = head;
		Node fast = head;
		while(true){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				fast = head;
				break;
			}
		}
		while(true){
			slow = slow.next;
			fast = fast.next;
			if(slow == fast){
				return slow;
			}
		}
	}
}
