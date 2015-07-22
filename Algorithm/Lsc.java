import java.util.List;
import java.util.ArrayList;
//lsc1:最大子序列
//最大子序列是要找出由数组成的一维数组中和最大的连续子序列。比如{5,-3,4,2}的最大子序列就是 {5,-3,4,2}，它的和是8,达到最大；而 {5,-6,4,2}的最大子序列是{4,2}，它的和是6。你已经看出来了，找最大子序列的方法很简单，只要前i项的和还没有小于0那么子序列就一直向后扩展，否则丢弃之前的子序列开始新的子序列，同时我们要记下各个子序列的和，最后找到和最大的子序列。
//
//
//lsc2:最长公共子串
//找 两个字符串的最长公共子串，这个子串要求在原字符串中是连续的。
//
//
//lsc3:最长公共子序列
//
//最长公共子序列与最长公共子串的区别在于最长公共子序列不要求在原字符串中是连续的，比如ADE和ABCDE的最长公共子序列是ADE，我们用动态规划的方法来思考这个问题。
public class Lsc{
	public static void main(String[] args){
		int[] arr = {1,3,-4,4,5,-3};
		lsc1(arr);	
		
		String s1 = "we are family";
		String s2 = "aare fama";
		//String s1 = "ab";
		//String s2 = "abc";

		String s3 = lsc2(s1,s2);
		System.out.println(s3);

		String str1 ="labablla";
		String str2 ="aabla";
		String str3 =lsc3(str1,str2);	
		System.out.println(str3);
	}
	public static void lsc1(int arr[]){
		int start=0;          //最大子序列开始位置
		int end=0;            //最大子序列结束位置
		int begin =0;         //当前序列开始位置
		int finish = 0;       //当前序列结束位置
		int sum=0;            //当前序列总和
		int max=0;	      //最大子序列总和	
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
	public static String lsc2(String str1,String str2){
		char[] arrY = str1.toCharArray();
		char[] arrX = str2.toCharArray();
		int yLen = arrY.length+1;    
		int xLen = arrX.length+1;
		int xP = 0;                  //记录最大子串的末尾索引
		int maxLen=0;		   //记录最大子串的长度
		int[] pre =new int[xLen];    //矩阵的前一行
		int[] curr =new int[xLen];   //矩阵的当前行
		for(int i=1;i<yLen;i++){
			for(int j=1;j<xLen;j++){
				if(arrX[j-1]==arrY[i-1]){
					curr[j] = pre[j-1]+1;
					if(curr[j]>maxLen){
						xP=j;
						maxLen = curr[j];
					}
				}else{
					curr[j]=0;
				}
			}
			//此处这样做会照成pre永远跟curr引用到同一个对象，大不到想要的赋值效果
			//pre = curr;
			for(int k=0;k<xLen;k++){
				pre[k]=curr[k];
			}
		}
		StringBuffer sb = new StringBuffer();
		//字符串真正的索引值比数组的索引值要小1
		for(int i = xP-maxLen;i<xP;i++){
			sb.append(arrX[i]);
		}
		return sb.toString();
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
