public class Lis{
	public static void main(String[] args){
		int[] arr = {1,3,5,2,3,6};
		int max = findLis(arr);
		System.out.println(max);
	}
	public static  int findLis(int arr[]){
		int len = arr.length;
		int LIS[] = new int[len];
		for(int i=0;i<len;i++){
			LIS[i]=1;
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j] && LIS[j]+1>LIS[i]){
					LIS[i] = LIS[j]+1;
				}
			}
		}
		int max=0;
		for(int i=0;i<len;i++){
			if(LIS[i]>max){
				max = LIS[i];
			}
		}
		return max;
	}
}
