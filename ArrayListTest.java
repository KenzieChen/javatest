import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		Integer[] arr = new Integer[5];
		//��arr�ĳ���С��list���ȵ�ʱ�򣬻����½�һ��arr������ʱ���ͣ�����������
		Integer[] arr2 = list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		//��arr3��list����ʱ��ֱ�ӿ�����arr3�С�
		Integer[] arr3 = new Integer[13];
		list.toArray(arr3);
		System.out.println(Arrays.toString(arr3));

		
	}
}
