//调用构造器之前执行私有变量赋值操作，无穷递归。。stack overflow
public class Reluctant{
	private Reluctant internalInstance = new Reluctant();
	public Reluctant() throws Exception {
		throw new Exception("I'm not coming out");
	}
	public static void main(String[] args){
		try{
			Reluctant b = new Reluctant();
			System.out.println("Surprise!");
		}catch(Exception ex){
			System.out.println("I told you so");
		}
	}
}
