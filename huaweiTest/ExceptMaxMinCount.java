//输入一串数，以','分隔，输出所有数中去掉最大值、最小值之后剩下的个数。（其中最大值与最小值可能有多个）?
//Smple input：3,3,5,3,6,9,7,9   Sample outPut: 3

public class ExceptMaxMinCount{
	public void bubbleSort(int[] arr){
		int len = arr.length;
		int temp =0;
		for(int i =0;i<len-1;i++){
			for(int j=0;j<len-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp =arr[j+1];
					arr[j+1] =arr[j];
					arr[j] =temp;
				}
			}
		}
	}

	public int count(String str){
		String[] stringArr = str.split(",");
		int len = stringArr.length;
		int[] arr = new int[len]; 
		for(int i =0;i<len;i++){
			arr[i] = Integer.parseInt(stringArr[i]);
		}
		bubbleSort(arr);
		int min=arr[0];
		int minCount =1;
		int max=arr[len-1];
		int maxCount =1;
		for(int i=1;i<len;i++){
			if(min==arr[i]){
				minCount++;
			}
			if(max == arr[len-1-i]){
				maxCount++;
			}
		}
		if(min == max){
			return 0;
		}else{
			return len-minCount-maxCount;
		}
	}
	public static void main(String[] args){
		ExceptMaxMinCount e = new ExceptMaxMinCount();
		int count = e.count("3,3,5,3,6,9,7,9");
		System.out.println(count);
	}
}
