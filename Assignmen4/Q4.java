package Assignmen4;
class AnonymousObject{
	private String nameString;

	public AnonymousObject(String nameString) {
		super();
		this.nameString = nameString;
	}
	@Override
	protected void finalize() {
		System.out.println("Garbage collected "+this.nameString);
	}
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymousObject("This is an anonymous object");
		System.gc();
	}

}
