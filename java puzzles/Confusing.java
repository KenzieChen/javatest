public class Confusing{
	public static void main(String[] args){
		new Confusing(null);
	}
	private Confusing(Object o){
		System.out.println("Object");
	}
	//���õ��Ǹù��췽��
	private Confusing(double[] dArray){
		System.out.println("Double Array");
	}
}
