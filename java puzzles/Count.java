public class Count{
	public static void main(String[] args){
		//2*10^9=(2^10)*(5^9)ת���ɶ����ƵĻ���λ������10��0����31λ��
		final int START = 2000000000;
		int count =0;
		for(float f =START;f<START+50;f++){
			count++;
		}
		System.out.println(count);
		float f1 = START;
		System.out.println(f1);
		//31λתΪ24λ������������ʧ
		System.out.println((float)(START+50));
		//תΪdouble�����о�����ʧ
		System.out.println((double)(START+50));
		System.out.println((float)(START+64));
		//��ӡ����2.00000013E9��Ϊʲô����2.000000128E10�أ�
		System.out.println((float)(START+128));

	}
}
