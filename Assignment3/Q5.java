package Assignment3;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ipScanner = new Scanner(System.in);
		System.out.println("Enter the two string");
		String str1 = ipScanner.next();
		String str2 = ipScanner.next();
		int n1;
		int n2;
		try {
			System.out.println("The two numbers are: ");
			 n1 = Integer.parseInt(str1);
			 n2 = Integer.parseInt(str2);
			 System.out.println(n1);
			 System.out.println(n2);
			try {
				int c = n1/n2;
				System.out.println(c);
			}
			catch(ArithmeticException e) {
				System.err.println(e.getMessage());
			}
		}
		catch(NumberFormatException e) {
			System.err.println(e.getMessage());
		}
	}

}
