//ºÚµ•—°‘Ò≈≈–Ú
import java.util.Arrays;
public class MySimpleSelectSort{
	public static void main(String[] args){
		int[] arr = new int[]{123,12,121,0,28};
		int positon =0;
		int temp =0;
		int length = arr.length;
		for(int i=0;i<length;i++){
			int position = positionMin(arr,i,length-1);
			temp = arr[position];
			arr[position] =arr[i];
			arr[i] = temp;	
		}
		System.out.println(Arrays.toString(arr));
	}
	public static int positionMin(int[] arr,int start,int end){
		if(start == end){
			return start;
		}
		int min = arr[start]; 
		int position =start;
		int length =arr.length;
		for(int i=start+1;i<=end;i++){
			if(arr[i]<min){
				min = arr[i];
				position = i;
			}
		}
		return position;
	}
}
class SimpleSelectSort {  
    public selectSort(){  
        int a[]={1,54,6,3,78,34,12,45};  
        int position=0;  
        for(int i=0;i<a.length;i++){  

            int j=i+1;  
            position=i;  
            int temp=a[i];  
            for(;j<a.length;j++){  
            if(a[j]<temp){  
                temp=a[j];  
                position=j;  
            }  
            }  
            a[position]=a[i];  
            a[i]=temp;  
        }  
        for(int i=0;i<a.length;i++)  
            System.out.println(a[i]);  
    }  
}
