import java.util.Arrays;
public class ReverseArray{
	public static void main(String[] args){
		int[] arr  = {1,2,3,4,5};
		int i =0;
		int len = arr.length/2;
		int temp=0;
		while(i<len){
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] =temp;
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
