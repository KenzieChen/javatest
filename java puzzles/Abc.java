public class Abc{
	public static void main(String[] args){
		String letters = "ABC";
		char [] numbers = {'A','B','C'};
		//ֱ�ӵ���char[]��toString�����������toStringֱ�Ӵ�object�̳�
		System.out.println(letters +" as easy as " +numbers);
		//��ӡchar[]�������
		System.out.println(char[].class.getName());
		//String.valueOf(char[])��ӡ��������
		System.out.println(letters +" as easy as " +String.valueOf(numbers));
		System.out.print(letters +" as easy as ");
		//print(char[])��ӡ��������
		System.out.println(numbers);
	}
}
