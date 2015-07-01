//一个空final域只有在它是明确未赋过值的地方才可以被赋值；
//编译器必须决绝某些证明是安全的程序，所以静态块中的try不能被执行；
//可以将静态块封装为一个方法，直接返回值给final域。
public class UnwelcomeGuest{
	public static  final long guestId = -1;
	private static final long userId;
	static {
		try{
			userId = getUserId();	
		}catch(IdUnavailableException e){
			userId = guestId;
			System.out.println("Logging in as guses");
		}
	}
	private static long getUserId() throws IdUnavailableException{
		throw new IdUnavailableException();
	}
	public static void main(String[] args){
		System.out.println("User ID:"+userId);
	}
}
class IdUnavailableException extends Exception{
	IdUnavailableException(){}
}
