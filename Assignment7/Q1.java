package Assignment7;
@FunctionalInterface
interface StringProcessor{
	int process(String input);
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringProcessor lengthProcessor = (String s) -> s.length();
		String testString = "Hello , Functional Interface!";
		int length = lengthProcessor.process(testString);
		System.out.println("The length of the string is : "+length);

	}

}

//OUTPUT
//The length of the string is : 29