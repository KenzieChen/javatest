import java.util.Deque;
import java.util.ArrayDeque;
public class ArrayDequeTest{
	public static void main(String[] args){
		Deque dq = new ArrayDeque();
		dq.add(1); //�൱��addLast
		dq.add(2);
		dq.add(3);
		dq.add(4);
		System.out.println(dq);
		
		Deque dq2 = new ArrayDeque();
		dq2.addFirst(1);
		dq2.addFirst(2);
		dq2.addFirst(3);
		dq2.addFirst(4);
		System.out.println(dq2);
		Deque dq3 = new ArrayDeque();
		dq3.push(1);
		dq3.push(2);
		dq3.push(3);
		dq3.push(4);
		System.out.println(dq3);
	}
}
