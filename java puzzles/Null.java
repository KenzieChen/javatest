public class Null{
	public static void greet() {
		System.out.println("Hello");
	}
	public static void main(String[] args){
		//����ͨ������������greet�Ǿ�̬����������ʵ����û��ϵ
		((Null)null).greet();
	}
}
