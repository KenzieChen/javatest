//������һ������������װ��n(1 �� n �� 65535)յ��ƣ���ͷ��β���1��2��3����n-1��n��ÿյ�����һ�����߿��ؿ��ơ���ʼ�����ȫ�����š�
//��n��ѧ���ӳ��ȴ�������һ��ѧ���Ѻ��뷲��1�ı����ĵ�ƵĿ�����һ�£����ŵڶ���ѧ���Ѻ��뷲��2�ı����ĵ�ƵĿ�����һ�£����ŵ�����ѧ���Ѻ��뷲��3�ı����ĵ�ƵĿ�����һ�£���˼�����ȥ������n��ѧ���Ѻ��뷲��n�ı����ĵ�ƵĿ�����һ�¡�n��ѧ�����˹涨����󣬳��������м�յ���š�ע���������ѧ����һ�¡�
 

//���룺��Ƶ�����

//��������ŵĵ������

//�������룺3

//���������1

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
