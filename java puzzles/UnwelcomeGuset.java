public class UnwelcomeGuset{
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
