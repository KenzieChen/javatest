//д��һ�����򣬽���һ��������ֵ���������ֵ�Ľ�������ֵ�����С�������ֵ���ڵ���5,����ȡ����С��5��������ȡ��
//-4.5 ��������Ľ����-4
//4.4 ��������Ľ����4
import java.util.Arrays;
public class MathRound{
	public static void main(String[] args){
		int re = round(-4.5);
		System.out.println(re);
	}
	public static int round(double num){
		String str = String.valueOf(num);
		String[] strArr;
		if(!str.contains(".")){
			return (int)num;
		}else{
			strArr = str.split("\\.");
		}
		System.out.println(Arrays.toString(strArr));
		if(Integer.parseInt(strArr[1].substring(0,1)) >=5){
			return (int)Math.ceil(num);
		}else{
			return (int)Math.floor(num);
		}
	}
}
