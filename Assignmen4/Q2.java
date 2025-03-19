package Assignmen4;

public class Q2 {
	private String name;
	public Q2(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	protected void finalize() {
		System.out.println("Garbage collected "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 obj1 = new Q2("Object 1");
		Q2 obj2 = new Q2("Object 2");
		obj1 = obj2;
		obj2 = null;
		System.gc();
	}

}
