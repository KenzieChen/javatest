/*
 *	�����ַ�������len1���ַ���s1���ַ�������len2���ַ���s2���Ӻ���ǰ�Ƚϣ�������ַ���Ϊ��׼�������ͬ��Ԫ�صĸ����� ����:  ���룺s1="1,3,5"   len1=3        s2="2,4 *	,1,7,5"   len2=5   
 *          �����1  
 *  
 */
public class FindDiff{
	public static int findDiff(int len1, String s1, int len2,String s2){
		String[] arr1 = s1.split(",");
		String[] arr2 = s2.split(",");
		int len = len1 >len2 ? len2-1 : len1-1;
		int diff =0;
		for(;len>=0;len--){
			if(!arr1[len1-1].equals(arr2[len2-1])){
				diff++;
			}
			len1--;
			len2--;
		}
		return diff;
	}
	public static void main(String[] args){
		String s1 = "4,4,4";
		int len1 = 3;
		String s2 = "1,2,3,4";
		int len2 = 4;
		System.out.println(findDiff(len1,s1,len2,s2));
	}
}

