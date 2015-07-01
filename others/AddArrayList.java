import java.util.ArrayList;
public class AddArrayList{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		Object o = new Object();
		list.add(o);
		list.add(o);
		System.out.println(list);
		System.out.println(list.get(0).equals(list.get(1)));
		
	}
}

