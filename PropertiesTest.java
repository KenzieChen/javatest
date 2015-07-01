import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest{
	public static void main(String[] args){
		try{
			File file = new File("F:\\db.property");
			if(!file.exists()){
				file.createNewFile();
			}

			FileOutputStream fos = new FileOutputStream(file);
			Properties p = new Properties();
			p.setProperty("driver","jdbc.Driver");
			p.setProperty("url","localhost:3306/db");
			p.setProperty("username","kenziechen");
			p.setProperty("password","*****");
			p.store(fos,"Properties for connecting to Database");
			
			FileInputStream fis = new FileInputStream(file);
			Properties p2 = new Properties();
			p2.load(fis);
			System.out.println(p2.getProperty("driver"));
			System.out.println(p2.getProperty("url"));

		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
