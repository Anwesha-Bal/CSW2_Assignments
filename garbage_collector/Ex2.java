package garbage_collector;

public class Ex2 {
	private String myObject;
	public Ex2(String myObj) {
		this.myObject = myObj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 testObject1 = new Ex2("test object 1");
		Ex2 testObject2 = new Ex2("test object 2");
		testObject1 = null;
		System.gc();
	}
	@Override
	protected void finalize()throws Throwable{
		System.out.println("Garbage collection is successfull for "+this.myObject);
	}

}
