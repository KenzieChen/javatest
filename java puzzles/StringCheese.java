public class StringCheese{
	public static void main(String[] args){
		byte[] bytes = new byte[256];
		for(int i=0;i<256;i++){
			bytes[i] = (byte)i;
		}
		String str = null;
		try{
			//����Ĭ�ϵı����ַ���GBK�������������ISO8859-1	
			str = new String(bytes,"ISO8859-1");
		}catch(Exception e){
			e.printStackTrace();
		}
		for(int i =0;i<str.length();i++){
			System.out.print((int)str.charAt(i)+" ");
		}
		System.out.println("\n"+java.nio.charset.Charset.defaultCharset());
	}
}
