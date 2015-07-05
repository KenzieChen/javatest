//假设a和b是两条递增有序链表，合并并保持有序
class Node{
	int data;
	Node next;
}
public class MergeSortedLink{
	public Node merge(Node a,Node b){
		Node root,temp;
		if(a==null || b==null){
			return (a == null?b:a);
		}
		if(a.data<b.data){
			temp=root=a;
			a=a.next;
		}else{
			temp=root =b;
			b=b.next;
		}
		while(a!=null && b!=null){
			if(a.data<b.data){
				temp.next = a;
				temp = a;
				a = a.next;
			}else{
				temp.next = b;
				temp = b;
				b = b.next;
			}
		}
		temp = (a==null?b:a);
		return root;
	}
}
