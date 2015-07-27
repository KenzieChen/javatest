//访问链表中倒数第k个节点
class Node{
	int val;
	Node next;
}
public class LastKNode{
	//方法一递归访问到并打印节点值
	public int  visitNode(Node root,int k){
		if(root ==null) return 0;
		int i = visitNode(root.next,k)+1;
		if(i==k){
			System.out.println(root.val);
		}
		return i;
	}
	
	//方法二两个指针先后访问链表，间隔 K个节点
	public Node visitNode2(Node root,int k){
		if(root == null) return null;
		Node p1 = root;
		Node p2 = root;
		for(int i=0;i<k-1;k++){
			p1 = p1.next;
			if(p1 ==null) return null;
		}
		while(p1.next !=null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;	
	}
}
