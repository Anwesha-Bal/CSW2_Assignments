package Assignment7;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime presentDateTime = LocalDateTime.now();
		System.out.println("Current date and time: "+presentDateTime);
		LocalDate taskDate=LocalDate.now().plusWeeks(2);
		System.out.println("Date after 2 weeks: "+taskDate);
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		String formatted1 = dateTime.format(formatter1);
		System.out.println(formatted1);
		
	}

}
