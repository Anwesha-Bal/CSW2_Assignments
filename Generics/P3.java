package Generics;

public class P3 {
	public static <T>void display(T[]arr) {
		for(T a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {5,6,7,8,9,10};
		display(arr);
		Character[]a = {'a','b','c','d','e'};
		display(a);
	}

}
