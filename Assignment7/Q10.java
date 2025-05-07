package Assignment7;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the initial date in YYYY-MM-DD: ");
		String date = ip.nextLine();
		LocalDate iDate = LocalDate.parse(date);
		LocalDate presentDate = LocalDate.now();
		System.out.println("Today's date: "+presentDate);
		int days = (int) ChronoUnit.DAYS.between(iDate, presentDate);
		System.out.println("Number of days between: "+iDate+" and "+presentDate+" is: "+days);
		
	}

}
