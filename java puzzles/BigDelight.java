public class BigDelight{
	public static void main(String[] args){
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		for(byte b = Byte.MIN_VALUE;b<Byte.MAX_VALUE;b++){
			//������ת��Ϊ�����ٱȽϣ�bΪbyte���ͣ��з��ţ�b��0x90ת��Ϊ�����󲻵���0x90
			if(b==0x90){
				System.out.println("Joy!");
			}
			//��intת��Ϊbyt�����ٱȽ�
			if(b==(byte)0x90){
				System.out.println("Joy!");
			}
			//byte����ȥ����ת��
			if((b&0xff)==0x90){
				System.out.println("Joy!");
			}
		}
	}

