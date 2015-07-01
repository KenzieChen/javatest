import java.util.Random;
public class Rhymes{
	private static Random rnd = new Random();
	public static void main(String[] args){
		//错误示例
		//StringBuffer word = null;
		//switch(rnd.nextInt(2)){
	//		case 1: word = new StringBuffer('P');
	//		case 2: word = new StringBuffer('G');
	//		default: word = new StringBuffer('M');
	//	}
	//	word.append('a');
	//	word.append('i');
	//	word.append('n');
	//	System.out.println(word);
		//方法一
		StringBuffer word =null;
		int i = rnd.nextInt(3);
		System.out.println(i);
		switch(i){
			case 1: 
				word = new StringBuffer("P");
				break;
			case 2: 
				word = new StringBuffer("G");
				break;
			default:
				word = new StringBuffer("M");
				break;
		}		
		word.append('a');
		word.append('i');
		word.append('n');
		System.out.println(word);
		//方法二
		System.out.println("MPG".charAt(i)+"ain");
		//方法三
		String [] MPG = {"Main","Pain","Gain"};
		System.out.println(MPG[i]);
	}
}
