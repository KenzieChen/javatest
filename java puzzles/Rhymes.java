import java.util.Random;
public class Rhymes{
	private static Random rnd = new Random();
	public static void main(String[] args){
		//����ʾ��
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
		//����һ
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
		//������
		System.out.println("MPG".charAt(i)+"ain");
		//������
		String [] MPG = {"Main","Pain","Gain"};
		System.out.println(MPG[i]);
	}
}
