//�˴�Dog���LittleDog���еķ������Ǿ�̬�ģ���������������������Dog���ʵ��õĶ��Ǿ�̬�ķ�������̬�ķ����ڱ����ʱ����Ѿ�ȷ�����˴����Ƕ�̬���ã�����ķ������У�
//��̬�������ܱ�����
public class Bark{
	public static void main(String[] args){
		Dog dog = new Dog();
		Dog littleDog = new LittleDog();
		dog.bark();
		littleDog.bark();
	}
}

class Dog{
	public static void bark(){
		System.out.println("woof");
	}
}
class LittleDog extends Dog { 
	public static void bark(){
	}
}
