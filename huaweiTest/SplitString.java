//��Ŀ: ��дһ����ȡ�ַ����ĺ���������Ϊһ���ַ������ֽ��������Ϊ���ֽڽ�ȡ���ַ�����   ����Ҫ��֤���ֲ����ذ�����硰��ABC��4��Ӧ�ý�Ϊ����AB�������롰��ABC��DEF����6��Ӧ�����Ϊ����ABC�������ǡ���ABC+���İ������
public class SplitString{
	public static void main(String[] args){
		String chinese = "12������";
		String splitStr = splitString(chinese,7);
		System.out.println(splitStr);
	}
	public static boolean isChinese(char word){
		//�����������ֽ����
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
