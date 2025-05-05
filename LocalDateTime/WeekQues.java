package LocalDateTime;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class WeekQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verifying date for a particular day
		DayOfWeek whichDay = LocalDate.parse("2018-03-10").getDayOfWeek();
		System.out.println(whichDay);
		//date of a month
		int dateOfMonth = LocalDate.parse("2018-03-10").getDayOfMonth();
		System.out.println(dateOfMonth);
		//Leap year check
		boolean isItaLeapYear = LocalDate.now().isLeapYear();
		System.out.println(isItaLeapYear);
		//To determine the sequence of events between two dates
		boolean beforeOrNot = LocalDate.parse("2018-06-13").isBefore(LocalDate.parse("2018-06-10"));
		System.out.println(beforeOrNot);
		boolean afterOrNot =  LocalDate.parse("2018-06-10").isAfter(LocalDate.parse("2018-06-09"));
		System.out.println(afterOrNot);
	
		
	}

}
