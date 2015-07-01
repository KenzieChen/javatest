public class GhostOfLooper{
	public static void main(String[] args){
		short i = -1;
		//以下循环中，i先变为int(0xffffffff)，无符号右移，变为0x7fffffff，之后强制转换为byte(组合赋值操作的性质)，值为0xffff，无限循环
		//while(i != 0){
		//	i >>>= 1;
		//}
	}
}
