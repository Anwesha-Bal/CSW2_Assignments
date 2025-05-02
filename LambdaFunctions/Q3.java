package LambdaFunctions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Q3 {
	interface announcement{
		public String announce();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("Sam");
		names.add("Alexender");
		names.add("Robert");
		names.add("Emily");
		System.out.println("Before sorting: "+names);
		Collections.sort(names , (String s1 , String s2)-> s1.length()-s2.length());
		System.out.println("After sorting by length: "+names);
		announcement a1=() -> {
			return "We have an important announcement to be made. ";
		};
		System.out.println(a1.announce());
	}

}

//Output
//Before sorting: [Sam, Alexender, Robert, Emily]
//After sorting by length: [Sam, Emily, Robert, Alexender]
//We have an important announcement to be made. 
