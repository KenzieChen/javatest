import java.util.Arrays;
public class ReverseList{
	public static void main(String[] args){
		Node head = new Node(0);
		newList(head,5);
		System.out.println("初始链表");
		output(head);
		head = reverse(null,head);
		System.out.println("递归反转链表");
		output(head);	
		head = reverse2(head);
		System.out.println("普通反转链表");
		output(head);
		head = reverse3(head);
		System.out.println("再次递归反转链表");
		output(head);
	}
	//形成链表
	public static void newList(Node head,int length){
		if(head ==null){
			System.out.println("链表头部为空！");
			return;
		}
		int i =0;
		while(++i<length){
			Node n = new Node(i);
			head.next = n;
			head = n;
		}
	}
	//输出链表
	public static void output(Node head){
		while(head != null){
			System.out.println(head.value);
			head = head.next;
		}
	}
	//递归反转链表
	public static Node reverse(Node pre,Node cur){
		Node head = null;	
		if(cur == null){
			return pre;
		}
		head = reverse(cur,cur.next);
		cur.next = pre;
		return head;
	}
	//递归反转链表2
	public static Node reverse3(Node head){
		if(head ==null || head.next == null){
			return head;
		}
		Node newHead = reverse3(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	//缓存当前节点的下一个节点，将当前节点指向前一节点
	public static Node reverse2(Node head){
		if(head == null){
			return null;
		}
		Node pre = head;
		Node cur = head.next;
		Node next =null;

		while(cur !=null){
			next = cur.next;	
			cur.next = pre;
			pre = cur;
			cur = next;
			
		}
		head.next = null;
		head = pre;
		return head;
	}
}
class Node{
	public Node(int value){
		this.value = value;
	}
	int value;
	Node next;
}
