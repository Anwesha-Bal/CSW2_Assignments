package Assignment3;
class CustomNullPointerException extends Exception{
	public CustomNullPointerException(String message) {
		super(message);
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String string = null;
			if(string==null) {
				throw new CustomNullPointerException("String is null");
			}
		}
		catch (CustomNullPointerException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}

}
