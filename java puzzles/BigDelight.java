public class BigDelight{
	public static void main(String[] args){
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		for(byte b = Byte.MIN_VALUE;b<Byte.MAX_VALUE;b++){
			//两个都转换为整数再比较，b为byte类型，有符号，b的0x90转换为整数后不等于0x90
			if(b==0x90){
				System.out.println("Joy!");
			}
			//将int转换为byt类型再比较
			if(b==(byte)0x90){
				System.out.println("Joy!");
			}
			//byte类型去符号转换
			if((b&0xff)==0x90){
				System.out.println("Joy!");
			}
		}
	}

