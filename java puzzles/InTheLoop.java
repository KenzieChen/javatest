public class InTheLoop{
	public static final int END = Integer.MAX_VALUE; 
	public static final int START = END-100; 
	public static void main(String[] args){
		int count=0;
		//��i����MAX��ʱ�򣬼������ӵõ�MIN������ѭ��������
		//for(int i=START;i<=END;i++)
		//	count++;
		//System.out.println(count);
		//i����max��ʱ������ˣ������ټ���һ��count
		for(int i=START;i<END;i++)
			count++;
		System.out.println(count);
		//���·�������Ϊ�������
		int i=START;
		count=0;
		do{
			count++;
		}while(i++!=END);
		System.out.println(count);
	}
}
