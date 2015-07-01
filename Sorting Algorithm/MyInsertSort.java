//直接插入排序
import java.util.Arrays;
public class MyInsertSort{
	public static void main(String[] args){
		int[] arr = new int[]{1,3,2,7,4,3,8};
	//	int[] arr = new int[]{3,1,0,4};
		int temp,j,length = arr.length;
		for(int i =1 ;i < length;i++){
			temp = arr[i];
			j = i-1;
			for(;j>=0;j--){
				if(temp<arr[j]){
					arr[j+1]=arr[j];
				}else{
					break;
				}
			}
			arr[j+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}

//参考
class insertSort {  
public insertSort(){  
    inta[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};  
    int temp=0;  
    for(int i=1;i<a.length;i++){  
       int j=i-1;  
       temp=a[i];  
       for(;j>=0&&temp<a[j];j--){  
       a[j+1]=a[j];                       //将大于temp的值整体后移一个单位  
    }  
       a[j+1]=temp;  
    }  
    for(int i=0;i<a.length;i++)  
       System.out.println(a[i]);  
}  
}
