//�� instanceof�жϣ����Ա���ǿ������ת�����ָ�루null������
public class Type{
	public static void main(String[] args){
		String s =null;
		//false��null�����κ����͵�ʵ��
		System.out.println(s instanceof String);
		Type t = new Type();
		//���뱨������ת��������
		//System.out.println(t instanceof String);
		//���б���ǿ��ת������
		t = (Type) new Object(); 
	}
}
