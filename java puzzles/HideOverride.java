//���غ���д������
public class HideOverride{
	public static void main(String[] args){
		Derived d = new Derived();
		//�����ͬ���򱻸���
		System.out.println(d.className);
		//������д����ķ���
		System.out.println(d.getClassName());
		//ת��Ϊ���࣬�õ��������
		System.out.println(((Base)d).className);
		//�����Ѿ���������д�������ڵõ�����ķ���
		System.out.println(((Base)d).getClassName());

	}
}

class Base{
	public String className = "Base";
	public String getClassName(){
		return "Base";
	};
}

class Derived extends Base{
	public String className ="Derived";
	public String getClassName(){
		return "Derived";
	}
}
