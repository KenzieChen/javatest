public class Null{
	public static void greet() {
		System.out.println("Hello");
	}
	public static void main(String[] args){
		//可以通过编译且运行greet是静态方法，有无实例都没关系
		((Null)null).greet();
	}
}
