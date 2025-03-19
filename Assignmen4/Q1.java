package Assignmen4;

import Basics.static_examples;

 class UnreachableObject{
	 String myObjectString;
	 public UnreachableObject(String myObj) {
		// TODO Auto-generated constructor stub
		this.myObjectString = myObj;
	}
	public void show() {
		UnreachableObject obj1 = new UnreachableObject("This is show object");
		obj1.display();
	}
	public void display() {
		UnreachableObject obj2 = new UnreachableObject("This is display object");
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Garbage collection is successful for "+this.myObjectString);
	}

}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnreachableObject object = new UnreachableObject("main object");
		object.show(); 
		System.gc();
	}

}
