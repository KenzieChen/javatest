//√∞≈›≈≈–Ú
import java.util.Arrays;
public class MyBubbleSort{
	public static void main(String[] args){
		int[] arr = new int[]{12,11,2,13,0,9,6};
		MyBubbleSort bs = new MyBubbleSort();
		bs.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		int length = arr.length;	
		for(int i=0;i<length;i++){
			int temp=arr[0];
			for(int j= 0;j<length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public  void bubbleSort(int[] arr){
		int len = arr.length;
		for(int i=0;i<len;i++){
			for(int j=0;j<len-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}
}

