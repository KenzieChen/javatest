import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
public class MapTest{
	public static void main(String[] args){
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(1,"a");
		m.put(2,"b");
		m.put(3,"c");
		System.out.println(m);
		Set s = m.entrySet();
		System.out.println(s);
		for(Entry e: s){  //�˴�e��object,����
			System.out.println(e);
		}
	}
}
