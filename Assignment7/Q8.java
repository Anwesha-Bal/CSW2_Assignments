package Assignment7;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dateTime = LocalDateTime.of(2025,5,7,14,30,45);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatted1 = dateTime.format(formatter1);
		System.out.println("Formatted: "+formatted1);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEE, yyyy-MM-dd hh:mm:ss a");
		String formatted2  = dateTime.format(formatter2);
		System.out.println("Along with day in 12hr format: "+formatted2);
	}

}
