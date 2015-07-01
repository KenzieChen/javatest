//假设Thing是库中的类，不可变，其中传入的参数i不可被其子类获取。
class Thing {
	public Thing(int i){}
}
class SomeOtherClass{
	public static int func(){
		return 5;
	}
}
//希望在MyThing的构造方法中给父类的构造方法传值，并把该值保存在MyThing的实例中
public class MyThing extends Thing {
	private final int arg;
	//该构造方法会出错，无法在调用福类型构造函数之前引用 arg
	//public MyThing(){
	//	super(arg = SomeOtherClass.func());
	//}
	//以下空的构造器调用有参构造器，传值，在有参构造器中先调用父类构造器，再给arg赋值；
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
