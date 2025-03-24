package string;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sBuffer = new StringBuffer("Anusandhan");
		sBuffer.append(" , Address");
		System.out.println("Append: "+sBuffer);
		sBuffer.insert(5, "person");
		System.out.println("Insert: "+sBuffer);
		sBuffer.delete(5, 10);
		System.out.println("Delete: "+sBuffer);
	}

}
