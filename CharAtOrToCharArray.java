public class CharAtOrToCharArray{
	
	public static void main(String[] args){
		char temp ='1';
		String s = "12314qweqe2eqqw4342321321ewdasdaswqeqwqewqem";
		for(int i =0;i<10;i++){
			s+=s;
		}
		long cur = System.currentTimeMillis();
		int length = s.length();
		for(int i =0; i<length;i++ ){
			temp=s.charAt(i);	
		}
		System.out.println(System.currentTimeMillis()-cur);
		
		cur = System.currentTimeMillis();
		char[] arr = s.toCharArray();
		int length2 = arr.length;
		for(int i =0 ;i<length2;i++){
			temp = arr[i];
		}
		System.out.println(System.currentTimeMillis()-cur);

	}
}
