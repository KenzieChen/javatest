//输入一段字符串，字符串中只包含大小写字母。要求完成函数删除给定字符串中出现次数最少的字符。输出删除完的字符串。如果有多个出现次数一样的字符，都为最少时，一并删除。
//例如：输入:abbccd，输出为bbcc。



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
	//第一种方法
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
	//第二种方法，直接用StringBuffer进行删除
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
