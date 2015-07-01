public class Increment{
	public static void main(String[] args){
		int j=0;
		for(int i=0;i<100;i++)
			//int temp = j; j=j+1;j=temp;不会增
			//j=j++;
			//j=j+1;int temp = j;j=temp;会增加
			j=++j;
		System.out.println(j);
	}
}
