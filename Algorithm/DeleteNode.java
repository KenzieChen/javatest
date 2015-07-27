//删除给定链表的其中一个节点，只能往后访问（最后一个节点无法删除）
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
