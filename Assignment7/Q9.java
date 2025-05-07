package Assignment7;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
public class Q9 {
	public static double interestCalculator(LocalDate startDate , double amount) {
		double interest = 0.08;
		LocalDate today = LocalDate.now();
		
		int days = (int) ChronoUnit.DAYS.between(startDate, today);
		double simpleInterest = (amount*interest*days)/100;
		return amount+simpleInterest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner ip = new Scanner(System.in);
			System.out.println("Enter the initial date in YYYY-MM-DD: ");
			String date = ip.nextLine();
			LocalDate iDate = LocalDate.parse(date);
			LocalDate presentDate = LocalDate.now();
			System.out.println("Enter the amount: ");
			double a = ip.nextDouble();
			double finalAmount = interestCalculator(iDate,a);
			System.out.println("Final Amount: "+finalAmount);
	}

}
