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

	//�ݹ鷽ʽһ(��ת��һ���ڵ��ָ��)
	public static Node reverse(Node head){
		//head==null��ֱ�ӷ���
		//head.next==null�ж��Ƿ����һ���ڵ�
		if(head ==null || head.next ==null){
			return head;
		}
		Node newHead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	//�ݹ鷽ʽ������ת��ǰ�ڵ��ָ��
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
	//һ���Ա���
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
