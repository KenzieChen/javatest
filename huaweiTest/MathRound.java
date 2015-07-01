//写出一个程序，接受一个浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整
//-4.5 四舍五入的结果是-4
//4.4 四舍五入的结果是4
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
