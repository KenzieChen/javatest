//����java�ĸ���ת���ַ�
public class Regex{
	public static void  main(String[] args){
		String str1 = "aa\bbb";
		String str2 = "aa'bbb";
		//�ĸ���\\\\������һ����\��
		str1 = str1.replaceAll("\\\\","\\\\\\\\");
		str2 = str2.replaceAll("'","\\\\");
		System.out.println(str1);
		System.out.println(str2);
		String str3 = "aa  bb";
		String str4 = "aa'bbb";
		str3 = str3.replaceAll("\\s+",".");
		System.out.println(str3);
		System.out.println("\\");

		String s = "ABSDB";
		//
		System.out.println(s.matches("[A-Z]{5}"));

		//��ĸ��������
		System.out.println("s".matches("\\w"));
		//����
		System.out.println("1".matches("\\d"));
		//�ո�
		System.out.println(" ".matches("\\s"));
		//����һ���ո�
		System.out.println("   ".matches("\\s+"));
		//0����1���ո�
		System.out.println("".matches("\\s?"));
		//�����ո�
		System.out.println("        ".matches("\\s*"));
	

		//����һ���ַ�
		System.out.println("c".matches("."));

		
	}
	
}
