public class AnimalFarm{
	public static void main(String[] args){
		final String pig = "length: 10";
		final String pig2 = "length: 10";
		final String dog = "length: "+pig.length();
		//dog���ǳ��������ڲ�ͬ�Ķ���
		System.out.println("Animals are equal:"+(pig==dog));
		//��equals�����Ƚ���ȣ���==�Ƚ���ͬ
		System.out.println("Animals are equal:"+pig.equals(dog));

		//���ȼ���+���ַ������ӷ�
		System.out.println("Animals are equal:"+pig==dog);
		//���������ڳ�����������ͬһ������
		System.out.println("Animals are equal:"+(pig==pig2));
		System.out.println("Animals are equal:"+pig==pig2);

	}
}
