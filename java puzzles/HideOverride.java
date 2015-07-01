//隐藏和重写的区别
public class HideOverride{
	public static void main(String[] args){
		Derived d = new Derived();
		//父类的同名域被覆盖
		System.out.println(d.className);
		//子类重写父类的方法
		System.out.println(d.getClassName());
		//转换为父类，得到父类的域
		System.out.println(((Base)d).className);
		//方法已经被父类重写，不能在得到父类的方法
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
