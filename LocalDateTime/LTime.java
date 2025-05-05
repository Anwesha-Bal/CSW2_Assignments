package LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime whatIsTheTime = LocalTime.now();
		System.out.println(whatIsTheTime);
		LocalTime parsingTime = LocalTime.parse("03:20");
		System.out.println(parsingTime);
		LocalTime usingOf = LocalTime.of(3,20);
		System.out.println(usingOf);
		//Add specific time to current time
		LocalTime fastForward = LocalTime.parse("03:20").plus(5,ChronoUnit.HOURS);
		System.out.println(fastForward);
		int whichHours = LocalTime.parse("03:20").getHour();
		System.out.println(whichHours);
		//Compare Time
		boolean compareTime = LocalTime.parse("03:20").isBefore(LocalTime.parse("02:30"));
		System.out.println(compareTime);
		LocalTime maximumTime = LocalTime.MAX;
		System.out.println(maximumTime);
	}

}
