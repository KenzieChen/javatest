import java.util.Arrays;
import java.util.ArrayList;
public class MyRadixSort{
	public static void main(String[] args){
		MyRadixSort rs = new MyRadixSort();
		int[] arr = new int[]{12,1,3,2,0,98,56};
		rs.radixSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public void radixSort(int[] arr){
		int length = arr.length;
		int max = 0;
		//search for the max one;
		for(int i=0; i<length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		int time = 0;
		while(max>0){
			time++;	
			max /=10;
		}
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i =0;i<10;i++){
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			list.add(list1);
		}
		for(int i =0; i<time;i++){
			for(int j=0;j<length;j++){
				int index = arr[j]%(int)Math.pow(10,i+1)/(int)Math.pow(10,i);
				list.get(index).add(arr[j]);
			}	
			int index =0;
			for(int a=0;a<10;a++){
				ArrayList<Integer> list2 = list.get(a);
				int size = list2.size();	
				for(int b=0;b<size;b++){
					arr[index++] = list2.get(b);
				}
				list2.clear();
			}
		}

	}
}
