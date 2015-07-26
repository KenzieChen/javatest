//经典的汉诺塔递归求解
//1.移动n-1个盘子从源到缓冲区
//2.将最底层的盘子从源移动到目标柱子
//3.将n-1个盘子从缓冲区移到目标柱子
public class HanNuoTower{
	public static void main(String[] args){
		int count=3;
		String src = "First";
		String buffer = "Second";
		String target = "Third";
		moveDisk(count,src,target,buffer);
	}


	public static void moveDisk(int count,String src,String target,String buffer){
		if(count ==1){
			System.out.println("move from "+src+" to "+target);
		}else{
			moveDisk(count-1,src,buffer,target);
			System.out.println("move from "+src+" to "+target);
			moveDisk(count -1,buffer,target,src);
		}
	}
}
