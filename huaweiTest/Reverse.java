public class Reverse{
	public static void main(String[] args){
		byte a =3;
		a = (byte)(a/2);
		int c =2;
		a +=c;
		//上面的等式没问题，可以自动类型转换；下面的会产生精度损失；
		//a = a+c;

	}
}
