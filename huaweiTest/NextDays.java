//假设1900年1月1日是星期一，然后让你输出之后的****年*月*日是星期几

//  *方法：getWeek(Stirng date);  //其中date的格式为 yyyy-MM-dd
public class NextDays{
	public static void main(String[] args){
		String date = "1900-03-01";
		String week = getWeek(date);
		System.out.println(week);
	}
	public static String getWeek(String date){
		String[] dateArr = date.split("-");
		int year = Integer.parseInt(dateArr[0]);	
		int month = Integer.parseInt(dateArr[1]);	
		int day = Integer.parseInt(dateArr[2]);
		int sum =0;
		String[] weeks ={"Sun","Mon","Tue","Wed","Thur","Fri","Sat"};
		for(int i=1900;i<year;i++){
			if(isLeapYear(i)){
				sum +=366;
			}else{
				sum += 365;
			}
		}	
		for(int i = 1;i<month;i++){
			switch(i){
				case 1:
					sum+=31;
					break;
				case 2:
					if(isLeapYear(year)){
						sum+=29;
						break;
					}
					sum+=28;
					break;
				case 3:
					sum+=31;
					break;
				case 4: 
					sum+=30;
					break;
				case 5:
					sum+=31;
					break;
				case 6:
					sum+=30;
					break;
				case 7:
					sum+=31;
					break;
				case 8:
					sum +=31;
					break;
				case 9:
					sum +=30;
					break;
				case 10:
					sum +=31;
					break;
				case 11:
					sum +=30;
					break;
				case 12 :
					sum+=31;
					break;
			}
		}
		sum +=day;
		System.out.println(sum);
		return weeks[sum%7];
		

	}
	public static boolean isLeapYear(int year){
		return (year%4==0 || year%100!=0) && year%400==0; 
	}
}


