package Basics;
class Demo_1{
	String name;
	void method() {
		System.out.println("Demo");
	}
}
class Demo_2 extends Demo_1{
	@Override void method() {
		System.out.println("Demo 1");
	}
}
public class upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_1 d = new Demo_2();
		d.name = "Parent";
		System.out.println(d.name);
		d.method();
		//Demo_2 d1 = (Demo_2)d;
		//d1.method();
	}

}
