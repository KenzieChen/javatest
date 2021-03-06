import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Date;

class LoggingInfo implements Serializable{
	private Date loggingDate = new Date();
	private String uid;
	private transient String pwd;
	public LoggingInfo(String uid, String pwd){
		this.uid = uid;
		this.pwd = pwd;
	}
	public String toString(){
		String password =null;
		if(pwd == null){
			password = "Not Set";
		}else{
			password = pwd;
		}
		return "id:"+uid+"\n password:"+password+"\n loggingDate:"+loggingDate;
	}
}
public class TransientTest{
	public static void main(String[] args){
		LoggingInfo info = new LoggingInfo("123","123456");
		File file = null;
		try{
			file = new File("Logging.out");
			if(!file.exists()){
				file.createNewFile();
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try{
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(info);
			ois = new ObjectInputStream(new FileInputStream(file));
			LoggingInfo info2 = (LoggingInfo)ois.readObject();
			System.out.println(info2.toString());
		}catch(IOException ioe2){
			ioe2.printStackTrace();	
		}catch(Exception e){
			e.printStackTrace();	
		}finally{
			try{	
				oos.close();
				ois.close();
			}catch(IOException ioe3){
				ioe3.printStackTrace();
			}
		}

		

	}
}
