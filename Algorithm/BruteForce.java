public class BruteForce{
	public static void main(String[] args){
		String s = "aaabcd";
		String t = "ab";
		System.out.println(bruteForce(s,t));
	}
	public static int bruteForce(String s,String t){
		char[] tt = t.toCharArray();
		char[] ss = s.toCharArray();
		int tLen = tt.length;
		int sLen = ss.length;
		int i=0;
		int j=0;
		int index =-1;
		while(i<sLen && j<tLen){
			if(ss[i]==tt[j]){
				i++;
				j++;
			}else{
				i = i-j+1;
				j=0;
			}
			if(j == tLen){
				index = i-j;
				break;
			}
			
		}
		return index;
	}
}
