import java.util.Arrays;
public class MyQuickSort3{
	public static void main(String[] args){
		int[] arr2 = new int[]{12,1,3,2,4,90,67,54,34,11,0,111};
		MyQuickSort quickSort = new MyQuickSort();
		quickSort.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
	public void sort(int arr[]){
		int length = arr.length;
		quickSort(arr,0,length-1);	
	}
	public	int getMiddle(int[] arr,int low,int high){
		int temp = arr[low];
		while(low < high){
			while(low<high && arr[high] >= temp){
				high--;
			}
			arr[high] = arr[low];
			while(low<high && arr[low] <= temp){
				low++;
			}
			arr[high] = arr[low];
			arr[low] = temp;
		}
		return low;
	}

	public void  quickSort(int[] arr,int low,int high){
		if(low<high){
			int mid = getMiddle(arr,low,high);
			quickSort(arr,low,mid-1);
			quickSort(arr,mid+1,high); 
		}
	}
}
