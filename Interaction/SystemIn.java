import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class SystemIn{
	public static void main(String []args){
		System.out.print("please input a string£º");	
		String output = getString();
		if(output!=null && !("").equals(output)){
			System.out.print(output);
		}else{
			System.out.print("you have input nothing");
		}
			
	}
	public static String getString(){
		//standard inputStream
		InputStream is = System.in;
		//convert byte to char
		InputStreamReader isR = new InputStreamReader(is);
		//use buffer to read chars as String
		BufferedReader br  = new BufferedReader(isR);
		String input = null;
		try{
			input = br.readLine();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		return input;
	}
}
