//β�����У�����һ�����ƺ��룬�Զ��ŷָ�����ƺ���������Ҫ��ֻҪȡ����λ,�磺AD123��12101���й� �ĳ��ƺŲ�����ȫ����ĸ��
// * ���ڶ�β�Ž������ƣ�β��Ϊ1,6����һ���У�β��Ϊ2,7���ܶ����У�β��Ϊ3,8���������� β��Ϊ4,9����������,β��Ϊ5,0����������.
//* �������ղ����С�β�Ų�Ϊ���֣��򿴵�4λ�Ƿ������֣������4λ������ ���֣���������3λ���Դ���ȥ��ֱ���ҵ������ֵ�ʱ��ֹ.
// * �����û�����Ϥϵͳ���п�����������ƣ��糵�Ʋ���5λ�����5λ������ȫ����ĸ��û�ö��ŷָ�ȣ��������������� һ�ɷ���error
//* ������û�������򷵻����еĳ��ƺ�,��û�У��շ��ؿ�.
//* ���磺 ���룺String theCarCard = "A1023,NB123,D12ZG",int limitDate = 3;
//*       �����A1023,NB123
//*       String limitedCarCard(String input)
import java.util.Arrays;
public class LimitCars{
	public static void main(String[] args){
		String theCarCard = "A1023,NB123,D1245";
		//String theCarCard = "DDDDD,ABCDE";

		int limitDate = 3;
		String output = limitedCarCard(theCarCard,limitDate);
		System.out.println(output);
	}
	public static String limitedCarCard(String input,int day){
		if(input ==null ||input.equals("")){return "";}
		String[] inputArr = input.split(",");
		int len = inputArr.length;
		if(len ==1){
			return "";
		}
		for(int i=0;i<len;i++){
			if(inputArr[i].length() != 5 || inputArr[i].matches("[a-bA-B]{5}")){
				System.out.println("������5λ");
				return "error";
			}else if(inputArr[i].matches("[A-Z]{5}")){
				System.out.println("ȫ����ĸ��");
				return "error";
			}else if(!inputArr[i].matches("[A-Z0-9]+")){
				System.out.println("�зǷ��ַ�");
				return "error";
			}

		}
		//intǿ��ת��Ϊchar������룬ע��char��1��������int��1
		char[] limitCards = new char[2];
		switch(day){
			case 1: 
			       limitCards[0] = '1';
			       limitCards[1] = '6';
			       break;
			case 2: 
			       limitCards[0] = '2';
			       limitCards[1] = '7';
			       break;
			case 3:  
			       limitCards[0] = '3';
			       limitCards[1] = '8';
			       break;
			case 4:  
			       limitCards[0] = '4';
			       limitCards[1] = '9';
			       break;
			case 5:  
			       limitCards[0] = '5';
			       limitCards[1] = '0';
			       break;
			case 6: 
			case 7:  
			       limitCards[0] = '*';
			       limitCards[1] = '*';
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<len;i++){
			for(int m =4;m>=0;m--){
				char current = inputArr[i].charAt(m);
				if(current ==limitCards[0] || current == limitCards[1]){
					sb.append(inputArr[i]+",");
				}
			}
		}
		sb.delete(sb.length()-1,sb.length());
		return sb.toString();
	}
}
