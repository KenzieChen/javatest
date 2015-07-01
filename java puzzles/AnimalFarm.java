public class AnimalFarm{
	public static void main(String[] args){
		final String pig = "length: 10";
		final String pig2 = "length: 10";
		final String dog = "length: "+pig.length();
		//dog不是常量，属于不同的对象
		System.out.println("Animals are equal:"+(pig==dog));
		//用equals方法比较相等，用==比较相同
		System.out.println("Animals are equal:"+pig.equals(dog));

		//首先计算+，字符串连接符
		System.out.println("Animals are equal:"+pig==dog);
		//两个常量在常量池中属于同一个对象
		System.out.println("Animals are equal:"+(pig==pig2));
		System.out.println("Animals are equal:"+pig==pig2);

	}
}
