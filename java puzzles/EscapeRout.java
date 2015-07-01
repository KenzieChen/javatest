public class EscapeRout{
	public static void main(String[] args){
		System.out.println("a\u0022.length()+\u0022b");
		//转义字符在编译的时候就转换为其所表示的字符
		System.out.println("\"a\".length()+\"b\"");
		System.out.println("a\u0022.length()+\u0022b".length());
		System.out.println("\"a\".length()+\"b\"".length());
	}
}
