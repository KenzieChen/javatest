import java.util.List;
import java.util.ArrayList;
//lsc1:���������
//�����������Ҫ�ҳ�������ɵ�һά�����к��������������С�����{5,-3,4,2}����������о��� {5,-3,4,2}�����ĺ���8,�ﵽ��󣻶� {5,-6,4,2}�������������{4,2}�����ĺ���6�����Ѿ��������ˣ�����������еķ����ܼ򵥣�ֻҪǰi��ĺͻ�û��С��0��ô�����о�һֱ�����չ��������֮ǰ�������п�ʼ�µ������У�ͬʱ����Ҫ���¸��������еĺͣ�����ҵ������������С�
//
//
//lsc2:������Ӵ�
//�� �����ַ�����������Ӵ�������Ӵ�Ҫ����ԭ�ַ������������ġ�
//
//
//lsc3:�����������
//
//�������������������Ӵ���������������������в�Ҫ����ԭ�ַ������������ģ�����ADE��ABCDE���������������ADE�������ö�̬�滮�ķ�����˼��������⡣
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
		int start=0;          //��������п�ʼλ��
		int end=0;            //��������н���λ��
		int begin =0;         //��ǰ���п�ʼλ��
		int finish = 0;       //��ǰ���н���λ��
		int sum=0;            //��ǰ�����ܺ�
		int max=0;	      //����������ܺ�	
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
		System.out.println("���ֵΪ��"+max+",��"+start+"��ʼ��"+"��"+end+"����");
	}
	public static String lsc2(String str1,String str2){
		char[] arrY = str1.toCharArray();
		char[] arrX = str2.toCharArray();
		int yLen = arrY.length+1;    
		int xLen = arrX.length+1;
		int xP = 0;                  //��¼����Ӵ���ĩβ����
		int maxLen=0;		   //��¼����Ӵ��ĳ���
		int[] pre =new int[xLen];    //�����ǰһ��
		int[] curr =new int[xLen];   //����ĵ�ǰ��
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
			//�˴����������ճ�pre��Զ��curr���õ�ͬһ�����󣬴󲻵���Ҫ�ĸ�ֵЧ��
			//pre = curr;
			for(int k=0;k<xLen;k++){
				pre[k]=curr[k];
			}
		}
		StringBuffer sb = new StringBuffer();
		//�ַ�������������ֵ�����������ֵҪС1
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
