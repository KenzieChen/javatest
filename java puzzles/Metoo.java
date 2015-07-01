import java.io.File;
public class Metoo{
	public static void main(String[] args){
		String className = "com.puzzle.Metoo";
		System.out.println(Metoo.class.getName().replaceAll("\\.",File.separator)+".class");
		System.out.println(className.replaceAll("\\.",File.separator)+".class");
	}
}
