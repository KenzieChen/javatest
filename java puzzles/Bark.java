//此处Dog类和LittleDog类中的方法都是静态的，类中声明的两个对象都是Dog，故调用的都是静态的方法，静态的方法在编译的时候就已经确定，此处不是动态调用（对象的方法才有）
//静态方法不能被覆盖
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
