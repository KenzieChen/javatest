public class Shifty{
	public static void main(String[] args){
		//int i=0;
		//�����int���ƶ�32λ�൱��û���ƶ�
		//while(-1<<i!=0){
		//	i++;
		//}
		//System.out.println(i);
		int distance =0;
		for(int i=-1;i!=0;i=i<<1){
			distance++;
		}
		System.out.println(distance);

	}
}
