//输入一个表达式，没有括号，数字小于0-9之间，输出计算结果，所有的中间结果化为整形。
//            例如:  输入：3+8×2/9-2  
//            输出：2  
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SimpleAlgorithm{
	String s = "123";
	public int getResult(String str){
		char[] charArr = str.toCharArray();
		int len = charArr.length;
		List<String> strList = new ArrayList<String>(len);
		for(int i=0;i<len;i++){
			strList.add(charArr[i]+"");
		}
		for(int i=0;i<len;i++){
			String sign = strList.get(i);
			String newResult = "";
			if("*".equals(sign) || "/".equals(sign)){
				if("*".equals(sign)){
					newResult = Integer.parseInt(strList.get(i-1))*Integer.parseInt(strList.get(i+1))+"";	
				}else{
					newResult = Integer.parseInt(strList.get(i-1))/Integer.parseInt(strList.get(i+1))+"";	
				}
				strList.set(i-1,newResult);
				strList.remove(i);
				strList.remove(i);
				len = strList.size();
				i--;
				System.out.println(strList);
			}
		}
		for(int i=0;i<len;i++){
			String sign = strList.get(i);
			String newResult = "";
			if("+".equals(sign) || "-".equals(sign)){
				if("+".equals(sign)){
					newResult = Integer.parseInt(strList.get(i-1))+Integer.parseInt(strList.get(i+1))+"";	
				}else{
					newResult = Integer.parseInt(strList.get(i-1))-Integer.parseInt(strList.get(i+1))+"";	
				}
				strList.set(i-1,newResult);
				strList.remove(i);
				strList.remove(i);
				len = strList.size();
				i--;
				System.out.println(strList);
			}
		}
		System.out.println(strList);
		return Integer.parseInt(strList.get(0));

	}
	public static void main(String[] args){
		SimpleAlgorithm sa = new SimpleAlgorithm();
		int result = sa.getResult("1*2*3/3+1+2-1");
		System.out.println(result);
	}
}
