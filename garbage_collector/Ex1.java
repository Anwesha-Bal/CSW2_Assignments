package garbage_collector;
public class Ex1 {
	private String myObject;
	public Ex1(String myObject) {
		this.myObject = myObject;
	}
	private static void testMethod1() {
		Ex1 myObjectTest1 = new Ex1("my Object 1");
		testMethod2();
	}
	private static void testMethod2() {
		Ex1 myObjectTest2 = new Ex1("my Object 2");
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Garbage collection is successful for "+this.myObject);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testMethod1();
		System.gc();
	}

}
