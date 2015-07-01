// 功能描述：数组的循环移位，
//输入：{a,b,c},2
//输出：{b,c,a} 
//要求实现方法：
/**
 *data :待循环数组
 *index:移动位数
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
