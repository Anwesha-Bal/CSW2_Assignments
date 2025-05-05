package LocalDateTime;
import java.time.LocalDateTime;
import java.time.Month;
public class LDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.of(2018, Month.MARCH,10,03,30));
		System.out.println(LocalDateTime.parse("2018-01-20T06:24:00"));
		//add using plus () subtract using minus()
		LocalDateTime addHours = LocalDateTime.now().plusHours(3);
		System.out.println(addHours);
		LocalDateTime subHours = LocalDateTime.now().minusHours(3);
		System.out.println(subHours);
		//get Month
		System.out.println(LocalDateTime.now().getMonth());
	}

}
