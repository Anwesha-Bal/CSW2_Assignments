package Assignmen4;
class NullifiedReference{
	private String name;
	public NullifiedReference(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	protected void finalize() {
		System.out.println("Garbage collected "+name);
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullifiedReference obj = new NullifiedReference("This is main object");
		obj = null;
		System.gc();
	}                                                                                                
}
