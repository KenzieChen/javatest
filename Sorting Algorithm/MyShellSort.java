//Ï£¶ûÅÅÐò
import java.util.Arrays;
public class MyShellSort{
	public static void main(String[] args){
		int[] arr = new int[]{9,8,7,6,5,4,3,2,1,0,12,79,90};
		int n = arr.length;
		int len = n;
		while(true){
			n=n/2;
			if(n==0){
				break;
			}
			for(int i=0; i<n;i++){
				for(int j=i+n;j<len;j+=n){
					int temp = arr[j];
					int k = j-n;
					for(;k>=0 && temp<arr[k];k-=n){
						arr[k+n]=arr[k];
					}
					arr[k+n] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
class shellSort {  
	public  shellSort(){  
    		int a[]={1,54,6,3,78,34,12,45,56,100};  
    		double d1=a.length;  
    		int temp=0;  
    		while(true){  
        		d1= Math.ceil(d1/2);  
        		int d=(int) d1;  
        		for(int x=0;x<d;x++){  
            			for(int i=x+d;i<a.length;i+=d){  
                			int j=i-d;  
                			temp=a[i]; 
                			for(;j>=0&&temp<a[j];j-=d){  
                				a[j+d]=a[j];  
                			}  
                			a[j+d]=temp;  
            			}  
        		}  
        		if(d==1)  
            			break;  
    		}  
    		for(int i=0;i<a.length;i++){  
        		System.out.println(a[i]);
		}	
	}  
}
