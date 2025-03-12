package Assignment3;

import java.util.*;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,3,2,10,14,8,5,6};
		Scanner ipScanner = new Scanner(System.in);
		System.out.println("The elements of array: ");
		for(int e : arr) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("Sorted array: ");
		Arrays.sort(arr);
		for(int e : arr) {
			System.out.print(e+" ");
		}
		System.out.println();
		try {
		System.out.println("Enter the index to get the element: ");
		int j = ipScanner.nextInt();
		System.out.println(arr[j]);
	}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		
	}

}
