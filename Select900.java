import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Select900{
    public static void main(String[] args){
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        while(count<900){
            int random = new Random().nextInt(1000);
            if(!map.containsKey(random)){
                map.put(random,random);
                count++;
            }
        }
      //  List<Integer> values = (List<Integer>) map.values();
   
        System.out.println(    map.values());
    }
}
