package Generics;

import Basics.static_examples;

public class P5 {
	public static <T> int countOccurence(T[]a , T target) {
		int c = 0;
		for(int i = 0 ; i<a.length ; i++) {
			if(a[i]==target) {
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr = {5,4,4,2,4,8,4};
		Integer target = 4;
		countOccurence(arr, target);
		System.out.println();
	}

}
