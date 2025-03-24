package string;

import java.util.*;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "apple,,banana,,grape,,";
		String[] posLimit = string.split(",",3);
		String[] zeroLimit = string.split(",",0);
		String[] negLimit = string.split(",",-1);
		for(String s : posLimit) {
			System.out.println(s.isEmpty()?"(empty)":s);
		}
		System.out.println("Positive limit (3): "+Arrays.toString(posLimit));
		for(String s : zeroLimit) {
			System.out.println(s.isEmpty()?"(empty)":s);
		}
		System.out.println("Zero limit (0): "+Arrays.toString(zeroLimit));
		for(String s : negLimit) {
			System.out.println(s.isEmpty()?"(empty)":s);
		}
		System.out.println("Negative limit (-1): "+Arrays.toString(negLimit));
	}
}
