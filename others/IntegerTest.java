//���Ի�����������ת��
public class IntegerTest{
	public static void main(String[] args){
		byte a = 3;
		char b ='a';
		//byte������ֱ�Ӹ�ֵ��char
		//char c = a;
		//byte����ֱ�Ӹ�ֵ��short
		//short c =a;
		//char������ֱ�Ӹ�ֵ��short
		//short c = b;
		int d = b;
		//print(b);
		String binary = Integer.toBinaryString(a);
		printString(binary);
		int ten = Integer.valueOf(binary,2);
		int ten2 = Integer.valueOf("45",2);
		printInt(ten);


	}

	public static void printString(String a){
		System.out.println(a);
	}
	public static void printInt(int a){
		System.out.println(a);
	}
}
