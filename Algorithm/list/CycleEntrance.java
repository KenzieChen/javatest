class Node{
	int val;
	Node next;
	public Node(){}
	public Node(int val){
		this.val = val;
	}
}

//���������һ���л�
//��ô��������ͷ��㵽����ھ���Ϊa����ָ�����ָ���һ����������뻻���Ϊb
//�����ܳ�ΪL������2(a+b) = a+b+n*L,nΪ��ָ���ߵ�Ȧ�����ó� n*L = a+b��������ָ��������ʱ���ÿ�ָ��ص�����ͷ��㣬ʹ������ָ��һ��һ��һ���ߣ������ߵ���������һ�������ĵط���ʱ����ָ��Ҳ�ߵ�������ڴ�֮ǰһ��������һֱ�ߵ�����ڵ㡣
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
