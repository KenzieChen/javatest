// ���������������ѭ����λ��
//���룺{a,b,c},2
//�����{b,c,a} 
//Ҫ��ʵ�ַ�����
/**
 *data :��ѭ������
 *index:�ƶ�λ��
 */
import java.util.Arrays;
public class OffsetArr{
	public static void main(String[] args){
		System.out.println(Arrays.toString(getChildren(new String[]{"a","b","c"},-2)));
	}
	public static String[] getChildren(String[] data,int index){
    		int len = data.length;
		int offset = index%len;
		String[] newArr = new String[len];
		for(int i=0;i<len;i++){
			newArr[(i+offset+len)%len] = data[i];
		}
		return newArr;
	}
}
