//将一个十进制数（byte类型）转化二进制数，将二进制数前后颠倒，再算出颠倒后其对应的十进制数
public class Ten2TwoReverse{
	public static void main(String[] args){
		Ten2TwoReverse test = new Ten2TwoReverse();
		test.getRes2((byte)2);
		System.out.println(test.getRes((byte)2));
	}
	public  byte getRes(byte num){
		int num2 = num;
		int result =0;
		while(num2>0){
			result = result*2+num2%2;
			num2 = num2/2;
		}
		return (byte)result;
	}

	public void getRes2(byte num){
		int myNum = tenToBinary(num);
		System.out.println(myNum);
		myNum = reverse(myNum);
		System.out.println(myNum);
		myNum = binaryToTen(myNum);
		System.out.println(myNum);
	}
	public int tenToBinary(int num){
		if(num == 0){
			return 0;
		}
		int i = num%2;
		return tenToBinary(num/2)*10+i;
	}
	public int reverse(int num){
		int result =0;
		while(num>0){
			result = result*10+num%10;
			num = num/10;
		}
		return result;
	}
	public int binaryToTen(int num){
		if(num ==0){
			return 0;
		}
		int i = num%10;
		return binaryToTen(num/10)*2+i;
	}
}
