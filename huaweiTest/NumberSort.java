//拆分字符串，字符串中含有逗号和数字，对数字排序并输出
import java.util.Arrays;
public class NumberSort{
	public int[] String2Int(String str){
		String[] strArr = str.split(",");
		int len = strArr.length;
		int[] intArr = new int[len];
		for(int i=0;i<len;i++){
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		return intArr;
	}
	//插入算法
	public void insertSort(int[] arr){
		int len = arr.length;
		int current =0;
		for(int i =1;i<len;i++){
			current = arr[i];
			int j=i-1;
			//这里是跟current进行比较，记住！
			while(j>=0 && arr[j]<current){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] =current;
		}
	}
	public static void main(String[] args){
		String str = new String("2,1,3,5,8,6,5");
		NumberSort ns = new NumberSort();
		int[] arr = ns.String2Int(str);
		int len = arr.length;
		//可以用Arrays.toString()代替
		for(int i=0;i<len;i++){
			if(i>=len-1){
				System.out.println(arr[i]);
			}else{
				System.out.print(arr[i]+",");
			}
		}
		ns.insertSort(arr);
		for(int i=0;i<len;i++){
			if(i>=len-1){
				System.out.println(arr[i]);
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
}
