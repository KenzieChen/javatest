import java.util.List;
import java.util.ArrayList;
//lsc1:最大子序列
//lsc2:最长公共子串
//lsc3:最长公共子序列
public class Lsc{
	public static void main(String[] args){
		int[] arr = {1,3,-4,4,5,-3};
		lsc1(arr);	

		String str1 ="labablla";
		String str2 ="aabla";
		String str3 =lsc3(str1,str2);	
		System.out.println(str3);
	}
	public static void lsc1(int arr[]){
		int start=0;
		int end=0;
		int begin =0;
		int finish = 0;
		int sum=0;
		int max=0;
		for(int i=0;i<arr.length;i++){
			sum +=arr[i];
			finish=i;
			if(sum>max){
				max = sum;
				start = begin;
				end=finish;
			}
			if(sum<=0){
				sum=0;
				begin=i+1;
			}
		}
		System.out.println("最大值为："+max+",从"+start+"开始，"+"到"+end+"结束");
	}

	public static String lsc3(String str1,String str2){
		int length1 = str1.length();
		int length2 = str2.length();
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		List<Character> list = new ArrayList<Character>();		
		int[][] count = new int[length1+1][length2+1];
		for(int i=1;i<length1+1;i++){
			for(int j = 1;j<length2+1;j++){
				if(arr1[i-1]==arr2[j-1]){
					count[i][j] = count[i-1][j-1]+1;
				}else if(count[i][j-1]>count[i-1][j]){
					count[i][j]=count[i][j-1];
				}else{
					count[i][j]=count[i-1][j];
				}
			}
			
		}
		int p1 = length1;
		int p2 = length2;
		while(p1!=0&p2!=0){
			if(arr1[p1-1]==arr2[p2-1]){
				list.add(arr1[p1-1]);
				p1--;
				p2--;
			}else if(count[p1-1][p2]>count[p1][p2-1]){
				p1--;
			}else{
				p2--;
			}
		}
		int length = list.size();
		StringBuffer sb = new StringBuffer();
		for(int i=length-1;i>=0;i--){
			sb.append(list.get(i));
		}
		return sb.toString();

	}
}
