import java.math.BigInteger;
public class BigProblem{
	public static void main(String[] args){
		BigInteger fiveThousand = new BigInteger("5000");
		BigInteger fiftyThousand = new BigInteger("50000");
		BigInteger fiveHundredThousand = new BigInteger("500000");

		BigInteger total = BigInteger.ZERO;
		//以下三个方法无效，Big和String一样是不可变类
		//total.add(fiveThousand);
		//total.add(fiftyThousand);
		//total.add(fiveHundredThousand);
		total = total.add(fiveThousand);
		total = total.add(fiftyThousand);
		total = total.add(fiveHundredThousand);
		
		System.out.println(total);
	}
}
