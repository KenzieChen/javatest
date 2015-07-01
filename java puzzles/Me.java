public class Me{
	public static void main(String[] args){
		String className = "com.puzzle.Me";
		System.out.println(Me.class.getName().replaceAll(".","/")+".class");
		System.out.println(Me.class.getName().replaceAll("\\.","/")+".class");
		System.out.println(className.replaceAll(".","/")+".class");
		System.out.println(className.replaceAll("\\.","/")+".class");
	}
}
