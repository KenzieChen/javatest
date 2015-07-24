import java.util.Arrays;
public class Sort{
	public static void main(String[] args){
		int arr[] = {1,4,2,5,3};
		//insertSort(arr);
		//bubbleSort(arr);
		//quickSort(arr);
		shellSort(arr);
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	//插入排序算法是稳定的排序算法
	public static void insertSort(int[] arr){
		int length = arr.length;
		for(int i=1;i<length;i++){
			int temp = arr[i];
			int j=i-1;
			while(j>=0&&temp<arr[j]){
				arr[j+1] = arr[j];
				j--;
			}	
			arr[j+1]=temp;
		}
	}
	//冒泡排序是稳定的排序算法
	public static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	//快速排序
	public static void quickSort(int[]arr){
		int low =0;
		int high =arr.length-1;
		if(low<high){
			_quickSort(arr,low,high);
		}
	}
	public static void _quickSort(int[] arr,int low,int high){
		if(low >= high) return;
		int middle = getMiddle(arr,low,high);
		_quickSort(arr,low,middle-1);
		_quickSort(arr,middle+1,high);
	}
	public static int getMiddle(int[] arr,int low,int high){
		int temp=arr[low];
		while(low<high){
			while(low<high && arr[high]>=temp){
				high--;
			}
			arr[low]=arr[high];
			while(low<high && arr[low]<= temp){
				low++;
			}
			arr[high] = arr[low];
		}
		arr[low] = temp;
		return low;
	}
	//归并排序
	public static void mergeSort(int arr[],int low,int high){
		if(low>=high) return;
		int middle = (low+high)/2;
		mergeSort(arr,low,middle);
		mergeSort(arr,middle+1,high);
		merge(arr,low,middle,high);
	}
	public static void merge(int arr[],int low,int middle,int high){
		int[] temp = new int[arr.length];
		int index =0;
		int i=low;
		int j =middle+1;
		while(i<=middle && j<=high){
			if(arr[i]<arr[j]){
				temp[index++] =arr[i++];
			}else{
				temp[index++] =arr[j++];
			}
		}
		while(i<=middle){
			temp[index++] = arr[i++];
		}
		while(j<=high){
			temp[index++] =arr[j++];
		}
		index =0;
		for(int m=low;m<=high;m++){
			arr[m] = temp[index++];	
		}
		
	}
	public static void shellSort(int arr[]){
		int length = arr.length;
		int d = length/2;
		while(d>0){
			for(int k=0;k<d;k++){
				for(int i=k+d;i<length;i=i+d){
					int cur = arr[i];
					int j=i-d;
					while(j>=0 &&arr[j]>cur){
						arr[j+d] =arr[j];
						j=j-d;
					}
					arr[j+d] =cur;

				}
			}

			d = d/2;
		}
	}



}
