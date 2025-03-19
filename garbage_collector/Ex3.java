package garbage_collector;
public class Ex3 {
	String myObject;
	public Ex3(String myObject) {
		this.myObject = myObject;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		new Ex3("test object anonymous");
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Garbage collection is successful for "+this.myObject);
	}

}
