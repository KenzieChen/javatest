public class InstanceInitTest{
	int a =9;
	{a=6;}

	public InstanceInitTest(){
		System.out.println(a);
	}
	public static void main(String[] args){
		InstanceInitTest iit =  new InstanceInitTest();
	}
}
