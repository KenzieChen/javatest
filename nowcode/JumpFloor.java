//��Ŀ����
//һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
//
public class JumpFloor {
	public static void main(String[] args) {
		System.out.println(Jump(3));
	}
	//�ݹ��㷨
    public static int Jump1(int target) {
	if(target==1) return 1;
        if(target==2)return 2;
        return Jump(target-1)+Jump(target-2);
    }
    //�����㷨
    public int Jump2(int target) {
	int i=1;
        int j=2;
        if(target ==1) return 1;
        if(target ==2) return 2;
        int result = 0;
        for(int k=3;k<=target;k++){
            result = i+j;
            i=j;
            j=result;
        }
        return result;
    }
    //��̬�滮��⣨�����
    public int jump(int target,int[] arr){
        if(target==1){
            arr[target] =1;
        }
        if(target==2){
            arr[target]=2;
        }
        if(arr[target]>0){
            return arr[target];
        }
        arr[target] = jump(target-1,arr)+jump(target-2,arr);
        return arr[target];
         
    }
}
