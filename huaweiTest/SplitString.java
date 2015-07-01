//题目: 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。   但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，应该输出为“我ABC”而不是“我ABC+汉的半个”。
public class SplitString{
	public static void main(String[] args){
		String chinese = "12我我我";
		String splitStr = splitString(chinese,7);
		System.out.println(splitStr);
	}
	public static boolean isChinese(char word){
		//汉字由两个字节组成
		return String.valueOf(word).getBytes().length >1 ? true : false;
	}
	public static String splitString(String str,int num){
		int count =0;
		char[] arr = str.toCharArray();
		int len =arr.length;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<len;i++){
			if(isChinese(arr[i])){
				count +=2;
			}else{
				count++;
			}
			if(count>num){
				break;
			}
			sb.append(arr[i]);

		}
		return sb.toString();
	}
}
