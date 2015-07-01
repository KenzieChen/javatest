import java.util.Random;
public class CoinSide{

	public static void main(String[] args){
		System.out.println(flip());
	}
	private static Random rnd=  new Random();
	public static CoinSide flip(){
		//�������javac -source 1.4 CoinSide.java ���룬����֣������������������ñ��������ǶԷ��������ʹ���5�汾֮ǰ��?�������ñ�������Ҫһ������һ���������ͻ�����ͬ����
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
