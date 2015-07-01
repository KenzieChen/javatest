public class InTheLoop{
	public static final int END = Integer.MAX_VALUE; 
	public static final int START = END-100; 
	public static void main(String[] args){
		int count=0;
		//当i增到MAX的时候，继续增加得到MIN，无限循环！！！
		//for(int i=START;i<=END;i++)
		//	count++;
		//System.out.println(count);
		//i等于max的时候结束了，不过少加了一个count
		for(int i=START;i<END;i++)
			count++;
		System.out.println(count);
		//以下方法可作为替代方案
		int i=START;
		count=0;
		do{
			count++;
		}while(i++!=END);
		System.out.println(count);
	}
}
