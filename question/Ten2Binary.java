public class Ten2Binary{
	public static void main(String[] args){
		int a = 6;
		System.out.println(convert(a));
	}
	public static int convert(int a){
		int r =0;
		while(a>0){
			r=r*10+a%2;
			a=a/2;
		}
		return r;
	}
}
