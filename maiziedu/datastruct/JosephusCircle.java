//Լɪ�����⣬����ɱ�ˣ�
public class JosephusCircle{
	public static void main(String[] args){
		Circle circle = new Circle();
		for(int i=0;i<8;i++){
			Node n = new Node(i);	
			circle.add(n);
		}
		output(circle);
		kill(circle,2);
	}	
	//������num,ɱ����num��
	public static void kill(Circle c, int num){
		if(c.tail == null){
			return;
		}
		while(c.tail != c.tail.next){
			Node current =c.tail;
			for(int i=0;i<num-1;i++){
				current = current.next;
			}
			System.out.println("ɱ����valueΪ"+current.next.value+"�Ľڵ�");
			current.next = current.next.next;
			c.tail = current;
		}
		System.out.println("���ʣ�½ڵ��valueΪ"+c.tail.value);

	}
	//�����
	public static void output(Circle c){
		Node start = c.tail;
		while(start != null){
			System.out.println(c.tail.value);
			c.tail = c.tail.next;
			if(c.tail == start){
				break;
			}	
		}
	}
}

class Circle{
	Node tail;
	public void add(Node node){
		if(tail == null){
			tail = node;
			tail.next = tail;
		}else{
			node.next = tail.next;
			tail.next = node;
			tail = node;
		}	
	}	
}
class Node {
	public Node(int v){
		value = v;
	}
	int value;
	Node next;
}