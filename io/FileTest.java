import java.io.File;
public class FileTest{
	public static void main(String[] args){
		File f = new File("test.txt");
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.exists());
	}
}
