import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
public class LinkedHashSetTest{

	public static void main(String[] args){
		Set ss = new LinkedHashSet();
		ss.add("java");
		ss.add("javaScript");
		ss.add("c");
		ss.add("c#");
		ss.add("c3");
		ss.add("c4");
		System.out.println(ss);
		Set s2 = new HashSet();
		s2.add("java");
		s2.add("javaScript");
		s2.add("c");
		s2.add("c#");
		s2.add("c3");
		s2.add("c4");
		System.out.println(ss);
	}
}
