//”–Œ Ã‚
public class ReplaceSpace{
	public static String replaceSpace(StringBuffer str) {
       		if(str == null){
            		return null;
        	}
    		int length = str.length();
        	for(int i = 0; i <length; i++){
            		if(str.charAt(i) == ' '){
               			str.replace(i,i+1,"%20");
            		}
        	}
        	return str.toString();
    }
    public static void main(String[] args){
	   StringBuffer str = new StringBuffer(" ");
	  String s = replaceSpace(str); 
	  System.out.println(s);
    }
}
