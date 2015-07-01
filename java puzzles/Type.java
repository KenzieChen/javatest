//用 instanceof判断，可以避免强制类型转换或空指针（null）出错
public class Type{
	public static void main(String[] args){
		String s =null;
		//false，null不是任何类型的实例
		System.out.println(s instanceof String);
		Type t = new Type();
		//编译报错，不可转换的类型
		//System.out.println(t instanceof String);
		//运行报错，强制转换出错
		t = (Type) new Object(); 
	}
}
