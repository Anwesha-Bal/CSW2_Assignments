package Assignment3;
import java.util.*;

import javax.management.ImmutableDescriptor;

import java.security.PublicKey;

public class Q9 {
	public static int readInputFromUser() {
		Scanner ip = new  Scanner(System.in);
		int i = 0;
		boolean isValid = false;
		while(!isValid) {
		try {
			System.out.println("Enter an integer: ");
			i = ip.nextInt();
			isValid=true;
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Invalid input . Please enter the proper input.");
			ip.next();
		}
	}
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = readInputFromUser();
		System.out.println(n);
	}

}
