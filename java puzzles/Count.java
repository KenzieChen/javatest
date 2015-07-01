public class Count{
	public static void main(String[] args){
		//2*10^9=(2^10)*(5^9)转换成二进制的话低位至少有10个0（共31位）
		final int START = 2000000000;
		int count =0;
		for(float f =START;f<START+50;f++){
			count++;
		}
		System.out.println(count);
		float f1 = START;
		System.out.println(f1);
		//31位转为24位，产生精度损失
		System.out.println((float)(START+50));
		//转为double不会有精度损失
		System.out.println((double)(START+50));
		System.out.println((float)(START+64));
		//打印的是2.00000013E9，为什么不是2.000000128E10呢？
		System.out.println((float)(START+128));

	}
}
