public class Abc{
	public static void main(String[] args){
		String letters = "ABC";
		char [] numbers = {'A','B','C'};
		//直接调用char[]的toString方法，数组的toString直接从object继承
		System.out.println(letters +" as easy as " +numbers);
		//打印char[]类的名字
		System.out.println(char[].class.getName());
		//String.valueOf(char[])打印数组内容
		System.out.println(letters +" as easy as " +String.valueOf(numbers));
		System.out.print(letters +" as easy as ");
		//print(char[])打印数组内容
		System.out.println(numbers);
	}
}
