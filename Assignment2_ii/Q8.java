package Assignment2_ii;
import java.security.PublicKey;
import java.util.*;

import javax.imageio.event.IIOReadWarningListener;
public class Q8 {
	public static boolean areAnagrams(String str1 , String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	for(char c : str1.toCharArray()) {
		if(charCountMap.containsKey(c)) {
			charCountMap.put(c, charCountMap.get(c)+1);
		}
		else {
			charCountMap.put(c,1);
		}
	}
	for(char c: str2.toCharArray()) {
		if(charCountMap.containsKey(c)) {
			charCountMap.put(c,charCountMap.get(c)-1);
			if(charCountMap.get(c)==0) {
				charCountMap.remove(c);
			}
			else {
				return false;
			}
		}
		return charCountMap.isEmpty();
	}
	return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ipScanner = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = ipScanner.nextLine();
		System.out.println("Enter the second string: ");
		String str2 = ipScanner.nextLine();
		if(areAnagrams(str1,str2)) {
			System.out.println(str1+" and "+str2+" are Anagrams.");
		}
		else {
			System.out.println(str1+" and "+str2+" are not Anagrams.");
		}
	}

}
