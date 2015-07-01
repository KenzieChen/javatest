//输入一段字符串，字符串中包含空格、数字、符号和字母（包含大小写），要求完成函数使得输出给定字符串中最长字符串，输出的字符串可以包含数字和字符，不可以有空格和符号。若有相同长度的字符串，则输出第一个。
//例如：输入:hello huawei!，输出为:huawei
public class LongestString{
	public static void main(String[] args){
		String input = "hello huawei! acbcdsdfes";
		String output = getResult(input);
		System.out.println(output);
	}
	public static String getResult(String input){
		char[] arr = input.toCharArray();
		int len = arr.length;
		String result = "";
		StringBuffer temp = new StringBuffer();
		for(int i=0;i<len;i++){
			if(Character.isLetterOrDigit(arr[i])){
				temp.append(arr[i]);
				//flag
			}else{
				if(temp.length()>result.length()){
					result = temp.toString();
				}
				temp.delete(0,temp.length());
			}
		}
		//可以在flag地方判断，如果是最后一个字符
		if(temp.length()>result.length()){
			result = temp.toString();
		}
		return result;
	}
}
