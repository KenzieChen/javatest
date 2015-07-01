public class Workout{
	public static void main(String[] args){
		workHard();
		System.out.println("It's nap time");
	}
	private static void workHard(){
		//以下程序理论上不会循环，其执行过程轨迹会形成一个二叉树形状，树的深度与虚拟机栈的深度有关，具体见《java解惑》
		//try{
		//	workHard();	
		//}finally{
		//	workHard();
		//}
		//以下由于递归调用，会出现stack overflow<F3><F4>
		workHard();
	}
}
