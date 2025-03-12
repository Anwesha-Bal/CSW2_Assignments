package Assignment3;

import java.util.*;
public class Q1 {
public static void displayNumericValue(String s) {
	if(s==null||s.isEmpty()) {
		throw new NullPointerException("Input string is null or empty");
	}
	int count = 0;
	for(int i = 2 ; i<s.length() ; i++) {
		char prev = s.charAt(i-2);
		char curr = s.charAt(i-1);
		char next = s.charAt(i);
		if(Character.isDigit(next)) {
			if(isVowel(prev)&& !isVowel(curr)) {
				System.out.println("Numeric character "+next+" Found after vowel: "+prev+" and consonant: "+curr);
				count++;
			}
		}
	}
	if(count==0) {
		System.out.println("No numeric character found after vowel and consonant.");
	}
}
public static boolean isVowel(char c) {
	return "aeiouAEIOU".indexOf(c)!=-1;
}
public static String extractAllNumbers(String s) {
	if(s==null||s.isEmpty()) {
		throw new NullPointerException("Input string is null or empty");
	}
	StringBuilder number = new StringBuilder();
	for(char c : s.toCharArray()) {
		if(Character.isDigit(c)) {
			number.append(c);
		}
	}
	return number.toString();
}
	public static void main(String[]args) {
	Scanner ipScanner = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String string = ipScanner.next();
	String numString = extractAllNumbers(string);
	System.out.println("Extract all numbers:               ");
	System.out.println(numString);
	System.out.println("Print the digits if it is after a vowel and consonant: ");
	displayNumericValue(numString);
	}
}
