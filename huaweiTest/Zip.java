//通过键盘输入一串小写字母(a~z)组成的字符串。请编写一个字符串压缩程序，将字符串中连续出席的重复字母进行压缩，并输出压缩后的字符串。（和第3题类似）
//压缩规则：
//    1、仅压缩连续重复出现的字符。比如字符串"abcbc"由于无连续重复字符，压缩后的字符串还是"abcbc"。
//    2、压缩字段的格式为"字符重复的次数+字符"。例如：字符串"xxxyyyyyyz"压缩后就成为"3x6yz"。
//要求实现函数： 
//     void stringZip(const char *pInputStr, long lInputLen, char *pOutputStr);
//    输入pInputStr：  输入字符串lInputLen：  输入字符串长度
//    输出 pOutputStr： 输出字符串，空间已经开辟好，与输入字符串等长；
//注意：只需要完成该函数功能算法，中间不需要有任何IO的输入输出
//示例 
//    输入：“cccddecc”   输出：“3c2de2c”
//    输入：“adef”     输出：“adef”
//    输入：“pppppppp” 输出：“8p”
import java.util.List;
import java.util.ArrayList;
public class Zip{
	public static void main(String[] args){
		String input = "pppppppp";
		StringBuffer output=new StringBuffer("");
		getResult(input,8,output);
		System.out.println(output.toString());
	}
	public static void getResult(String inputStr,long inputLen, StringBuffer outputStr){
		if(inputLen == 0){
			return;	
		}
		if(inputStr == null || inputStr == ""){
			return;
		}
		int len = inputStr.length();
		List<Character> inputStrArr = new ArrayList<Character>();
		int[] counts = new int[len];
		for(int i=0;i<len;i++){
			counts[i] =1;
		}
	       for(int i=0;i<len;i++){
		       inputStrArr.add(inputStr.charAt(i));
	       }
       		for(int i=0;i<inputStrArr.size();i++){
			char current = inputStrArr.get(i);
			for(int j=i+1;j<inputStrArr.size();j++){
				if(current == inputStrArr.get(j)){
					counts[i]++;
					inputStrArr.remove(j);
					j--;
				}else{
					break;
				}	
			}
		}
		int size = inputStrArr.size();
		for(int i=0;i<size;i++){
			if(counts[i]>1){
				outputStr.append(counts[i]);
			}
			outputStr.append(inputStrArr.get(i));
		}
	}
}
