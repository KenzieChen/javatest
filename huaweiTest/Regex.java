//测试java的各种转义字符
public class Regex{
	public static void  main(String[] args){
		String str1 = "aa\bbb";
		String str2 = "aa'bbb";
		//四个“\\\\”代表一个“\”
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

		//字母或者数字
		System.out.println("s".matches("\\w"));
		//数字
		System.out.println("1".matches("\\d"));
		//空格
		System.out.println(" ".matches("\\s"));
		//至少一个空格
		System.out.println("   ".matches("\\s+"));
		//0或者1个空格
		System.out.println("".matches("\\s?"));
		//任意多空格
		System.out.println("        ".matches("\\s*"));
	

		//任意一个字符
		System.out.println("c".matches("."));

		
	}
	
}
