//����д��ĸת�������ӦСд��ĸ��ĵ������ĸ������z�Ĵ�ͷ��ʼ����
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
