//描述：一条长廊里依次装有n(1 ≤ n ≤ 65535)盏电灯，从头到尾编号1、2、3、…n-1、n。每盏电灯由一个拉线开关控制。开始，电灯全部关着。
//有n个学生从长廊穿过。第一个学生把号码凡是1的倍数的电灯的开关拉一下；接着第二个学生把号码凡是2的倍数的电灯的开关拉一下；接着第三个学生把号码凡是3的倍数的电灯的开关拉一下；如此继续下去，最后第n个学生把号码凡是n的倍数的电灯的开关拉一下。n个学生按此规定走完后，长廊里电灯有几盏亮着。注：电灯数和学生数一致。
 

//输入：电灯的数量

//输出：亮着的电灯数量

//样例输入：3

//样例输出：1

public class LightOn{
	public int countLightOn(int number){
		int[] lights = new int[number];
		for(int i=1; i<=number;i++){
			for(int j=1;j<=number;j++){
				if(j%i ==0){
					lights[j-1] = lights[j-1] ==0 ? 1 : 0;
				}
			}
		}
		int count =0;
		for(int i=0;i<number;i++){
			if(lights[i] == 1)
				count++;
		}
		return count;
	}
	public static void main(String[] args){
		LightOn lo = new LightOn();
		int count=lo.countLightOn(10);
		System.out.println(count);
	}
}
