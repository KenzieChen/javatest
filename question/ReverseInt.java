//import java.util.Math;
public class ReverseInt{
	public static void main(String[] args){
		int a=2313;
		a = reverse(a);
		System.out.println(a);
		a=reverse2(a);
		System.out.println(a);
		String b=reverse3(a);
		System.out.println(b);
	}
	public static int reverse(int a){
		if(a<10) return a;
		int b = reverse(a/10);
		return (int)(a%10*Math.pow(10,Integer.toString(b).length()))+b;
	}
	public static int reverse2(int a){
		int r =0;
		while(a!=0 ){
			r = r*10+a%10;
			a = a/10;
		}
		return r;
	}
	public static String reverse3(int a){
		if(a<10)
			return ""+a;
		return ""+a%10+reverse3(a/10);
	}
}
