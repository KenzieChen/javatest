import static java.util.Arrays.toString;
public class ImportDuty{
	public static void main(String[] args){
		printArgs(1,2,3,4,5);
	}
	static void printArgs(Object... args){
		//���µ��õ���Object��toString���������������Arrays.toString����
		System.out.println(toString(args));
	}
}