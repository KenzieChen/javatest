public class InstanceOfTest{
	public static void main(String[] args){
		Person p = new Person();
		Person ps = new Student();
		Student s = new Student();
		String str = "abc";
		boolean flag1 = p instanceof Person;
		boolean flag2 = ps instanceof Person;
		boolean flag3 = p instanceof Student;
		boolean flag4 = ps instanceof Student;
	//	boolean flag5 = str instanceof Student;   不可转换的类型
	//	测试null,对于所有类来说，null都不是其实例
		boolean flag6 =  null instanceof Student;
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		System.out.println(flag4);
	//	System.out.println(flag5);
		System.out.println(flag6);
	}
}
class Person{
	private	int age;
	private String name;
}
class Student extends Person{
	private String className; 
}
