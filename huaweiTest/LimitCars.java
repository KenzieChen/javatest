//尾号限行：输入一串车牌号码，以逗号分割开，车牌号码有以下要求，只要取后五位,如：AD123，12101，中国 的车牌号不可能全是字母。
// * 现在对尾号进行限制：尾号为1,6则周一限行，尾号为2,7则周二限行，尾号为3,8则周三限行 尾号为4,9则周四限行,尾号为5,0的周五限行.
//* 周六周日不限行。尾号不为数字，则看第4位是否是数字，如果第4位还不是 数字，继续看第3位，以此下去，直到找到有数字的时候止.
// * 由于用户不熟悉系统，有可能输入错误车牌，如车牌不满5位或大于5位、车牌全是字母、没用逗号分割等，如有输入错误情况 一律返回error
//* 如输入没有问题则返回限行的车牌号,如没有，刚返回空.
//* 例如： 输入：String theCarCard = "A1023,NB123,D12ZG",int limitDate = 3;
//*       输出：A1023,NB123
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
				System.out.println("不满足5位");
				return "error";
			}else if(inputArr[i].matches("[A-Z]{5}")){
				System.out.println("全是字母！");
				return "error";
			}else if(!inputArr[i].matches("[A-Z0-9]+")){
				System.out.println("有非法字符");
				return "error";
			}

		}
		//int强制转换为char变成乱码，注意char的1并不等于int的1
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
