//����һ���ַ������ַ�����ֻ������Сд��ĸ��Ҫ����ɺ���ɾ�������ַ����г��ִ������ٵ��ַ������ɾ������ַ���������ж�����ִ���һ�����ַ�����Ϊ����ʱ��һ��ɾ����
//���磺����:abbccd�����Ϊbbcc��



import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLeast{
	public static void main(String[] args){
		String str = "abbccd";
		String str1 = remove(str);
		System.out.println(str1);
		String str2 = remove2(str);
		System.out.println(str2);
	}
	//��һ�ַ���
	public static String remove(String str){
		int len = str.length();
		if(len ==0){
			return "";
		}
		List<Character> strArr = new ArrayList<Character>();
		for(int i=0;i<len;i++){
			strArr.add(str.charAt(i));
		}
		int[] counts = new int[len];
		int min = Integer.MAX_VALUE;
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(strArr.get(i) == strArr.get(j)){
					counts[i]++;
				}
			}
			if(min > counts[i]){
				min = counts[i];
			}
		}
		int size =strArr.size();
		StringBuffer sb = new StringBuffer("");
		for(int i=0;i<size;i++){
			if(counts[i] > min){
				sb.append(strArr.get(i));
			}
		
		}
		return sb.toString();
	}
	//�ڶ��ַ�����ֱ����StringBuffer����ɾ��
	//
	public static 	String remove2(String str){
		int len = str.length();
		if(len ==0){
			return "";
		}
		StringBuffer sb = new StringBuffer(str);
		int[] counts = new int[len];
		int min = Integer.MAX_VALUE;
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(sb.charAt(i) == sb.charAt(j)){
					counts[i]++;
				}
			}
			if(min > counts[i]){
				min = counts[i];
			}
		}
		int index =0;
		for(int i =0;i<len;i++){
			if(counts[i] == min){
				sb.deleteCharAt(index);
			}else{
				index++;
			}
		}
		return sb.toString();
	}
}
