//������10��ѧ��������ĩ����������ɺ�A��ʦ��Ҫ���������ߣ�Ҫ�����£�
//(1) ��������10�ı�����
//(2) ��֤������60%��ѧ������
//(3) ������е�ѧ��������60�֣��򼰸���Ϊ60��

public class PassLine{
	public void bubbleSort(int arr[]){
		int len = arr.length;
		int temp =0;
		for(int i=0;i<len-1;i++){
			for(int j=0;j<len-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;	
				}
			}
		}
	}
	public int getPassLine(int arr[]){
		bubbleSort(arr);
		if(arr[0] >=60){
			return 60;
		}else{
			return arr[4]/10*10;
		}
	}
	public static void main(String[] args){
		int[] arr = new int[]{61,51,49,30,20,10,70,80,90,99};
		PassLine pl = new PassLine();
		int passLine =pl.getPassLine(arr);
		System.out.println(passLine);
	}
}
