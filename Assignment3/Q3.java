package Assignment3;

import java.util.*;

public class Q3 {
	public static int convert (String s){
		int n = Integer.parseInt(s);
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the string: ");
		try {
			String s = ip.next();
			int n = convert(s);
			System.out.println(n);
			}
		catch(NumberFormatException e) {
			System.out.println("Invalid Input");
			}
		ip.close();
	}

}
