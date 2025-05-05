package Assignment7;
import java.util.*;
//class comp implements Comparator<String>{
//	@Override
//	public int compare(String str1 , String str2) {
//		return str2.compareTo(str1);
//	}
//}
public class Q3 {
	public static void display(ArrayList<String> arr) {
		for(String s : arr) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arr = new ArrayList<>();
		arr.add("Alexa");
		arr.add("Gemini");
		arr.add("Chatgpt");
		arr.add("DeepSeek");
		System.out.println("List Before Sorting: ");
		display(arr);
		Collections.sort(arr , (String s2 , String s1)-> s1.length()-s2.length());
		System.out.println("After sorting by length: ");
		display(arr);
	}

}
