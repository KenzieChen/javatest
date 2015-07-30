class Node{
	int val;
	Node next;
	public Node(){}
	public Node(int val){
		this.val = val;
	}
}

public class ReverseList{
	public static void main(String[] args){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		Node head2 = head;
		while(head2!=null){
			System.out.println(head2.val);
			head2 = head2.next;
		}
		head = reverse(head);
		head2 = head;
		while(head2!=null){
			System.out.println(head2.val);
			head2 = head2.next;
		}
		head = reverse2(head);
		head2 = head;
		while(head2!=null){
			System.out.println(head2.val);
			head2 = head2.next;
		}
		head = reverse3(head);
		head2 = head;
		while(head2!=null){
			System.out.println(head2.val);
			head2 = head2.next;
		}
	}

	//递归方式一(反转下一个节点的指向)
	public static Node reverse(Node head){
		//head==null空直接返回
		//head.next==null判断是否到最后一个节点
		if(head ==null || head.next ==null){
			return head;
		}
		Node newHead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	//递归方式二（反转当前节点的指向）
	public static Node reverse2(Node head){
		Node pre =null;
		Node cur = head;
		return _reverse2(pre,cur);
	}
	public static Node _reverse2(Node pre,Node cur){
		if(cur==null){
			return pre;
		}
		Node newNode = _reverse2(cur,cur.next);
		cur.next = pre;
		return newNode;
	}
	//一次性遍历
	public static Node reverse3(Node head){
		Node pre = null;
		Node cur = head;
		Node next = null;
		while(cur !=null){
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}

	
}
