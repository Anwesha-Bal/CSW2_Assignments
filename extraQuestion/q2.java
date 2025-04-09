package extraQuestion;
import java.util.*;
public class q2 {
	public static int frequency(String str,int k) {
		int count = 1;
		for(int i = 0 ; i<str.length();i++) {
			for(int j = i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbcddefggh";
		TreeSet<Character> set = new TreeSet<>();
		for(char e : str.toCharArray()) {
			set.add(e);
		}
		int c =0;
		System.out.print(set);
		for(int i =0 ; i<set.size();i++) {
			c = frequency(str,i);
		}
	}

}
