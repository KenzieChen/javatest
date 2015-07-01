import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class IteratorTest{
	public static void main(String[] args){
		Set<String> s = new HashSet<String>();
		s.add("java");
		s.add("c");
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			String s1 = it.next();
			if("java".equals(s1)){
				it.remove();
			}
		}
		for(String str : s){
			System.out.println(str);
		}
	}
}
