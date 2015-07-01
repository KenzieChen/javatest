import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		Integer[] arr = new Integer[5];
		//当arr的长度小于list长度的时候，会重新建一个arr的运行时类型，拷贝并返回
		Integer[] arr2 = list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		//当arr3比list长的时候，直接拷贝到arr3中。
		Integer[] arr3 = new Integer[13];
		list.toArray(arr3);
		System.out.println(Arrays.toString(arr3));

		
	}
}
