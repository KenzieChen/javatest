//ɾ���������������һ���ڵ㣬ֻ��������ʣ����һ���ڵ��޷�ɾ����
public class DeleteNode{
	public void delete(Node node){
		if(node ==null || node.next ==null){
			return;
		}
		node.val = node.next.val;
		node.next= node.next.next;
	}
}
class Node{
	int val;
	Node next;
}
