//将大写字母转换成其对应小写字母后的第五个字母，大于z的从头开始数。
public class UperToLower{
	public char uperToLower(char word){
		char newChar = (char)(word+32+5);
		if(newChar>'z'){
			newChar = (char)(newChar-26); 
		}
		return newChar;
	}
	public static void main(String[] args){
		UperToLower u2l = new UperToLower();
		char a ='Y';
		char b = u2l.uperToLower(a);
		System.out.println(b);
	} 
}
