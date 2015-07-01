import java.util.Arrays;
public class MyMergeSort{
	public static void main(String[] args){
		MyMergeSort ms = new MyMergeSort();
		int[] arr = new int[]{1,3,4,2,1,4,90,65,32,1,32,4,3,5,67,8,3,43,23};
		ms.sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public void sort(int[] arr,int left,int right){
		if(left>=right) return;
		int center = (left+right)/2;
		sort(arr,left,center);
		sort(arr,center+1,right);
		merge(arr,left,center,right);
	}
	public void merge(int[] arr,int left,int center, int right){
		int[] tempArr = new int[arr.length];
		int middle = center+1;      //center为左边部分的最后一位，Middle为右边部分的第一位
		int tempIndex =left;
		int index = left;
		while(left<=center && middle<=right){
			if(arr[left] <arr[middle]){
				tempArr[tempIndex++] = arr[left++];
			}else{
				tempArr[tempIndex++] = arr[middle++];
			}
		}
		while(left<=center){
			tempArr[tempIndex++] = arr[left++];
		}
		while(middle <= right){
				tempArr[tempIndex++] = arr[middle++];
		}
		while(index<=right){
			arr[index] = tempArr[index];
			index++;
		}
	}
}
