package Basics;
class Multiply{
	//high cohesive behaviour
	int a = 5;
	int b = 5;
	public int mul(int a , int b) {
		this.a = a;
		this.b = b;
		return a*b;
		
	}
}
public class Cohesive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiply multiply = new Multiply();
		System.out.println(multiply.mul(5, 5));
		System.out.println(multiply);
	}

}
