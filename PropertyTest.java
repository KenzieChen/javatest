import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
public class PropertyTest{
	public static void main(String[] args) throws Exception{
		File f = new File("f:/Porperty.txt");
		f.createNewFile();  //┐╔─▄IOException
		FileOutputStream fos =null;
		try{
			 fos = new FileOutputStream(f);
		}catch(FileNotFoundException e){}
		Properties p = new Properties();
		p.setProperty("a","aa");
		p.setProperty("b","bb");
		try{
		
			p.store(fos,"test");
		}catch(Exception e){}
		
		
	}
}
