import java.util.Arrays;
public class ReverseList{
	public static void main(String[] args){
		Node head = new Node(0);
		newList(head,5);
		System.out.println("��ʼ����");
		output(head);
		head = reverse(null,head);
		System.out.println("�ݹ鷴ת����");
		output(head);	
		head = reverse2(head);
		System.out.println("��ͨ��ת����");
		output(head);
		head = reverse3(head);
		System.out.println("�ٴεݹ鷴ת����");
		output(head);
	}
	//�γ�����
	public static void newList(Node head,int length){
		if(head ==null){
			System.out.println("����ͷ��Ϊ�գ�");
			return;
		}
		int i =0;
		while(++i<length){
			Node n = new Node(i);
			head.next = n;
			head = n;
		}
	}
	//�������
	public static void output(Node head){
		while(head != null){
			System.out.println(head.value);
			head = head.next;
		}
	}
	//�ݹ鷴ת����
	public static Node reverse(Node pre,Node cur){
		Node head = null;	
		if(cur == null){
			return pre;
		}
		head = reverse(cur,cur.next);
		cur.next = pre;
		return head;
	}
	//�ݹ鷴ת����2
	public static Node reverse3(Node head){
		if(head ==null || head.next == null){
			return head;
		}
		Node newHead = reverse3(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	//���浱ǰ�ڵ����һ���ڵ㣬����ǰ�ڵ�ָ��ǰһ�ڵ�
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
