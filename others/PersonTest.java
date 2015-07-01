class Person{
	private String name;
	public Person(String name){this.name = name;}
	public boolean equals(Person p){
		return p.name.equals(this.name);
	}
	//下面是正确的equals写法
	
	//public boolean equals(Object p){
	//	if(p == this){
	//		return true;
	//	}
	//	if(!(p instanceof Person)){
	//		return false;
	//	}
	//	Person p1 = (Person) p1;
	//	return p1.name.equals(this.name);
	//}
}
public class PersonTest{
	public static void main(String[] args){
		Person p1 = new Person("2");
		Person p2 = new Person("1");
		boolean b = p1.equals(p2);
		System.out.println(b);
		//System.out.println(p1.name);
	}
}
