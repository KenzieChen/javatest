public class Confusing{
	public static void main(String[] args){
		new Confusing(null);
	}
	private Confusing(Object o){
		System.out.println("Object");
	}
	//调用的是该构造方法
	private Confusing(double[] dArray){
		System.out.println("Double Array");
	}
}
