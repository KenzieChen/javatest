import static java.util.Arrays.toString;
public class ImportDuty{
	public static void main(String[] args){
		printArgs(1,2,3,4,5);
	}
	static void printArgs(Object... args){
		//以下调用的是Object的toString方法，并不会调用Arrays.toString方法
		System.out.println(toString(args));
	}
}
