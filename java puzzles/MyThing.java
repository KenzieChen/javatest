//����Thing�ǿ��е��࣬���ɱ䣬���д���Ĳ���i���ɱ��������ȡ��
class Thing {
	public Thing(int i){}
}
class SomeOtherClass{
	public static int func(){
		return 5;
	}
}
//ϣ����MyThing�Ĺ��췽���и�����Ĺ��췽����ֵ�����Ѹ�ֵ������MyThing��ʵ����
public class MyThing extends Thing {
	private final int arg;
	//�ù��췽��������޷��ڵ��ø����͹��캯��֮ǰ���� arg
	//public MyThing(){
	//	super(arg = SomeOtherClass.func());
	//}
	//���¿յĹ����������вι���������ֵ�����вι��������ȵ��ø��๹�������ٸ�arg��ֵ��
	public MyThing() {
		this(SomeOtherClass.func());
	}
	private MyThing(int i){
		super(i);
		arg = i;
	}
	public int getArg(){
		return arg;
	}
}
