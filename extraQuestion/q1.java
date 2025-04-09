package extraQuestion;
import java.util.*;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		HashSet<String> set = new HashSet<>();
		ArrayList<String> arr = new ArrayList<>();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter only the part before @ of email: ");
			
			String str = ip.nextLine();
			arr.add(str.concat("@gmail.com"));
			System.out.println("Enter T/t if you want to add more email else enter F/f");
			String continueInput = ip.nextLine();

			if (continueInput.equalsIgnoreCase("t")) {
				flag = true;
			} else if (continueInput.equalsIgnoreCase("f")) {
				flag = false;
			} else {
				System.out.println("Invalid input. Please enter 'true' or 'false'.");
			}
		}
		System.out.print(arr+" ");
		for(String s : arr) {
			set.add(s);
		}
		System.out.println("List of emails after removing duplicatite elements are: ");
		System.out.println(set);
	}

}
