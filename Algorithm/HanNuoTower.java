//����ĺ�ŵ���ݹ����
//1.�ƶ�n-1�����Ӵ�Դ��������
//2.����ײ�����Ӵ�Դ�ƶ���Ŀ������
//3.��n-1�����Ӵӻ������Ƶ�Ŀ������
public class HanNuoTower{
	public static void main(String[] args){
		int count=3;
		String src = "First";
		String buffer = "Second";
		String target = "Third";
		moveDisk(count,src,target,buffer);
	}


	public static void moveDisk(int count,String src,String target,String buffer){
		if(count ==1){
			System.out.println("move from "+src+" to "+target);
		}else{
			moveDisk(count-1,src,buffer,target);
			System.out.println("move from "+src+" to "+target);
			moveDisk(count -1,buffer,target,src);
		}
	}
}
