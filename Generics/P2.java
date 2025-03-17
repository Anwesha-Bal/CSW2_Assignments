package Generics;
public class P2 {
	public static <T> void swap(T []arr , int i ,  int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}             
	public static <T>void display(T[]arr) {
		for(T a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array before swapping");
		Integer[] arr = {5,6,7,8,9,10};
		display(arr);
		System.out.println("Array after swapping");
		swap(arr, 2, 4);
		display(arr);
		System.out.println("Array before swapping");
		Character[]a = {'a','b','c','d','e'};
		display(a);
		System.out.println("Array after swapping");
		swap(a, 2, 4);
		display(a);
		}
}
