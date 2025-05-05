package LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TODAY'S DATE
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		//Any Date
		System.out.println(LocalDate.of(2018, 01, 01));
		//Any date using parse
		System.out.println(LocalDate.parse("2018-01-01"));
		//Add specific number of days to the current date
		LocalDate taskDate=LocalDate.now().plusDays(1);
		System.out.println(taskDate);
		//To Achieve the desire date exactly one month in the past
		LocalDate lastMonth = LocalDate.now().minus(1,ChronoUnit.MONTHS);
		System.out.println(lastMonth);
	}
}
