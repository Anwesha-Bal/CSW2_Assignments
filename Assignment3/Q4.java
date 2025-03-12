package Assignment3;
import java.util.*;

import javax.swing.DefaultRowSorter;

import Basics.static_examples;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ipScanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = ipScanner.nextInt();
		try {
			double sqroot = calculate(num);
			System.out.println("The square root of  "+num +" is "+sqroot);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}
	public static double calculate(int num) throws ArithmeticException{
		if(num<0) {
			throw new ArithmeticException("Negative number not allowed");
		}
		double sq = Math.sqrt(num);
		if(sq!=(int)sq) {
			throw new ArithmeticException("Not a perfect square value");
		}
		return sq;
	}

}
