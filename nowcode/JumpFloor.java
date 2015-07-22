//题目描述
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
//
public class JumpFloor {
	public static void main(String[] args) {
		System.out.println(Jump(3));
	}
	//递归算法
    public static int Jump1(int target) {
	if(target==1) return 1;
        if(target==2)return 2;
        return Jump(target-1)+Jump(target-2);
    }
    //迭代算法
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
    //动态规划求解（打表法）
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
