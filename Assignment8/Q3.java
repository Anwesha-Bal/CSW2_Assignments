package Assignment8;
interface Calculator{
	public void getVal(int n1,int n2 );
}
class Thread1_i extends Thread{
		int a , b;
		Thread1_i(int a , int b){
			this.a = a;
			this.b = b;
		}
		public void run() {
		Calculator c1 = (a ,b)->{
			int sum = a+b;
			System.out.println("Sum is : "+sum);
		};
		c1.getVal(a, b);
	}
}
class Thread2_ii extends Thread{
	int a , b;
	Thread2_ii(int a , int b){
		this.a = a;
		this.b = b;
	}
	public void run() {
		Calculator c2 = (a, b)->{
			int diff = a-b;
			System.out.println("Difference is : "+diff);
		};
		c2.getVal(a, b);
	}
}
class Thread3_iii extends Thread{	
	int a , b;
	Thread3_iii(int a , int b){
		this.a = a;
		this.b = b;
	}
	public void run() {
		Calculator c3 = (a,b)->{
			int mul = a*b;
			System.out.println("Multiplication  is : "+mul);
		};
		c3.getVal(a, b);
	}
}
class Thread4_iv extends Thread{
	int a , b;
	Thread4_iv(int a , int b){
		this.a = a;
		this.b = b;
	}
	public void run() {
		Calculator c4 = (a , b)->{
			int div = a/b;
			System.out.println("Division is : "+div);
		};
		c4.getVal(a, b);
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		Thread1_i t1 = new Thread1_i(20,10);
		Thread2_ii t2 = new Thread2_ii(20,10);
		Thread3_iii t3 = new Thread3_iii(20,10);
		Thread4_iv t4 = new Thread4_iv(20,10);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

//Output
//Difference is : 10
//Division is : 2
//Sum is : 30
//Multiplication  is : 200
