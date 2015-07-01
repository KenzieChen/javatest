import java.util.Arrays;
public class MergeSortedArr{
	public static void main(String[] args){
		int[] a = {1,3,5};
		int[] b = {3,5,8};
		int[] c = merge(a,b);
		System.out.println(Arrays.toString(c));
	}
	public static int[] merge(int[] a,int[] b){
		int m =0;
		int n=0;
		int i =0;
		int c[] = new int[a.length+b.length];
		while(m<a.length && n<b.length){
			if(a[m]<b[n]){
				c[i++] = a[m++];
			}else{
				c[i++] = b[n++];
			}	
		}
		while(m<a.length){
			c[i++] = a[m++];
		}
		while(n<b.length){
			c[i++] =b[n++];
		}
		return c;
	}
}
