//求两个字符串的最长公共子串，若有长度相等的公共子串，返回第一次出现的。子串指至少两个字符，单个字母不算子串。
import java.util.List;
import java.util.ArrayList;
public class LongestCommonSubStr{
	public static void main(String[] args){
		String s1 = "aaabbabac";
		String s2 ="aabac";
		String sub = getCommon(s1,s2);
		System.out.println(sub);
	}
	public static String getCommon(String str1,String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1 <2 || len2 <2 ){return "";}
		String longStr ="";
		String shortStr = "";
		if(len1>len2){
			longStr = str1;
			shortStr = str2;
		}else{
			longStr = str2;
			shortStr = str1;
		}
		List<String> subStrs = new ArrayList<String>();
		int shortLen = shortStr.length();
		int max =0;
		for(int i=0;i<shortLen;i++){
			for(int j=i+2;j<=shortLen;j++){
				String sub = shortStr.substring(i,j);
				if(longStr.indexOf(sub) != -1 && sub.length()>max){
					subStrs.add(sub);
					max = sub.length();
				}
			}
		}
		int size = subStrs.size();
		String str4Return ="";
		for(int i =0;i<size;i++){
			if(subStrs.get(i).length() == max){
				str4Return = subStrs.get(i);
				break;
			}
		}
		return str4Return;
	}
}
