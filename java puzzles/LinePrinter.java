public class LinePrinter{
	public static void main(String[] args){
		//以下注释会导致编译出错
		//Note: \u000A is Unicode representation of linefeed(LF)
		char c = 0x000A;
	       System.out.println(c);	
	       System.out.println('\n');
	}
}
