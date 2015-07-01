//MyQuickSort_Error的修正
import java.util.Arrays;
public class MyQuickSort{
	public static void main(String[] args){
		int[] arr2 = new int[]{12,1,3,2,4,90,67,54,34,11,0,111};
		//int[] arr2 = new int[]{12,3};
		MyQuickSort quickSort = new MyQuickSort();
		quickSort.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
	public void sort(int arr[]){
		int length = arr.length;
		quickSort(arr,0,length-1);	
	}

	public void  quickSort(int[] arr,int low,int high){
		int start = low;
		int end =high;
		if(start < end){ //防止数组越界
			int mid = arr[low];
			while(low<high)	{
				while(low<high && arr[high]>=mid){
					//if(arr[high]<mid){
					//	arr[low] = arr[high];
					//	low++;
					//	break;
					//}
					high--;
				}
				arr[low] = arr[high];
				//low++;    //当high=low的时候low++之后low>high 下面的arr[high] = arr[low];会出错
				while(low<high && arr[low]<=mid){
					//if(arr[low]>mid){
					//	arr[high] = arr[low];
					//	high--;
					//	break;
					//}
					low++;
				}
				arr[high] = arr[low];
				//high--;
			}
				arr[low] = mid;
		}	
		if(start<end){
			quickSort(arr,start,low-1);
			quickSort(arr,low+1,end); 
		}
	}
}
