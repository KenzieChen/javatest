import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map.Entry;
public class HashMapTest2{
	public static void main(String[] args){
		Map<String,String> map = new HashMap<String,String>();
		String key,value;
		long currentTime;
		for(int i=1;i<1000000;i++){
			key = ""+i*50;
			value = "value";
			map.put(key,value);
		}

		System.out.println("开始keySet()/iterator遍历key,value");
		currentTime = System.currentTimeMillis();
		Iterator<String> it = map.keySet().iterator();;
		while(it.hasNext()){
			key = it.next();
			value = map.get(key);
		}
		System.out.println(System.currentTimeMillis()-currentTime);
		
		System.out.println("开始keySet()/for遍历key,value");
		currentTime = System.currentTimeMillis();
		for(String key1 : map.keySet()){
			value = map.get(key1);
		}
		System.out.println(System.currentTimeMillis()-currentTime);

		System.out.println("开始entrySet/Iterator遍历key,value");
		currentTime = System.currentTimeMillis();
		Iterator<Entry<String,String>> entryIterator = map.entrySet().iterator();
		Entry<String,String> entry1;
		while(entryIterator.hasNext()){
			entry1 = entryIterator.next();
			key =  entry1.getKey();
			value = entry1.getValue();
		};
		System.out.println(System.currentTimeMillis()-currentTime);

		System.out.println("开始entrySet/for遍历key,value");
		currentTime = System.currentTimeMillis();
		for(Entry<String,String> entry2 : map.entrySet()){
			key = entry2.getKey();
			value =entry2.getValue();
		};
		System.out.println(System.currentTimeMillis()-currentTime);

		
	}
}
