//描述：10个学生考完期末考试评卷完成后，A老师需要划出及格线，要求如下：
//(1) 及格线是10的倍数；
//(2) 保证至少有60%的学生及格；
//(3) 如果所有的学生都高于60分，则及格线为60分

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
