import java.util.Random;
public class CoinSide{

	public static void main(String[] args){
		System.out.println(flip());
	}
	private static Random rnd=  new Random();
	public static CoinSide flip(){
		//如果采用javac -source 1.4 CoinSide.java 编译，会出现？操作符后面两个引用变量都不是对方的子类型错误，5版本之前，?后面引用变量必须要一个是另一个的子类型或者相同类型
		return rnd.nextBoolean()?Heads.INSTANCE : Tails.INSTANCE;
	}
}
class Heads extends CoinSide{
	private Heads(){}
	public static final Heads INSTANCE = new Heads();
	public String toString(){
		return "heads";
	}
}

class Tails extends CoinSide{
	private Tails(){}
	public static final Tails INSTANCE = new Tails();
	public String toString(){
		return "tails";
	}
}
