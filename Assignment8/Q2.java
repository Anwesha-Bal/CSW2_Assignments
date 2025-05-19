package Assignment8;
class Add{
	public void add(int a , int b) {
		System.out.println(a+" + "+b+" = "+a+b);
	}
}
class Multiply{
	
	public void multiply(int a , int b) {
		System.out.println(a+" * "+b+" = "+a*b);
	}
}
class Substract{
	public void substract(int a , int b) {
		System.out.println(a+" - "+b+" = "+(a-b));
	}
}
class Divide{
	public void divide(int a , int b) {
		try {
			if(b==0) {
				throw new ArithmeticException("Number cannot be divided by 0!!");
			}
			System.out.println(a+" / "+b+" = "+(a/b));
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
class Thread1 extends Thread{
	Add a;
	Thread1 (Add a){
		this.a = a;
	}
	@Override
	public void run() {
		a.add(20, 10);
	}
}
class Thread2 extends Thread{
	Multiply m;
	Thread2 (Multiply m){
		this.m = m;
	}
	@Override
	public void run() {
		m.multiply(20, 10);
	}
}
class Thread3 extends Thread{
	Substract s;
	Thread3 (Substract s){
		this.s = s;
	}
	@Override
	public void run() {
		s.substract(20, 10);
	}
}
class Thread4 extends Thread{
	Divide d;
	Thread4 (Divide d){
		this.d = d;
	}
	@Override
	public void run() {
		d.divide(20, 10);
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a = new Add();
		Multiply m = new Multiply();
		Substract s = new Substract();
		Divide d = new Divide();
		Thread1 t1 = new Thread1(a);
		Thread2 t2 = new Thread2(m);
		Thread3 t3 = new Thread3(s);
		Thread4 t4 = new Thread4(d);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

//Output
//20 + 10 = 2010
//20 * 10 = 200
//20 - 10 = 10
//20 / 10 = 2