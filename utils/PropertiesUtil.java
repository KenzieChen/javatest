import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	public static void main(String[] args) {
		Properties property = new Properties();
		try {
			File file = new File("f:/db.properties");
			if (!file.exists()) {
				file.createNewFile();
			}
			// –¥»Î
			property.setProperty("database", "localhost");
			property.setProperty("user", "javaniu");
			property.setProperty("password", "password");
			property.store(new FileOutputStream(file), null);

			// ∂¡»°
			property.load(new FileInputStream(file));
			System.out.println(property.getProperty("database"));
			System.out.println(property.getProperty("user"));
			System.out.println(property.getProperty("password"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
