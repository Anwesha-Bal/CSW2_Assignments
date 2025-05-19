package Assignment8;
class Addition {
	public void add(int n) {
		int sum = 0;
		for(int i = 1 ; i<=n ; i++) {
			sum = sum+i;
		}
		System.out.println("The sum is: "+sum);
	}
}
class Table{
	int m = 1;
	public void multiply(int n) {
		for(int i = 1 ; i<=10 ; i++) {
			m = n*i;
			System.out.println(n+" * "+i+" = "+m);
		} 
	}
}
class MyThread1 extends Thread{
	Addition a;
	MyThread1(Addition a ){
		this.a = a;
	}
	public void run() {
		a.add(6);
	}
	
}
class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t = t;
	}
	public void run() {
		t.multiply(5);
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a = new Addition();
		Table t = new Table();
		MyThread1 t1 = new MyThread1(a);
		MyThread2 t2 = new MyThread2(t);
		t1.start();
		t2.start();
	}
}

//Output
//The sum is: 21
//5 * 1 = 5
//5 * 2 = 10
//5 * 3 = 15
//5 * 4 = 20
//5 * 5 = 25
//5 * 6 = 30
//5 * 7 = 35
//5 * 8 = 40
//5 * 9 = 45
//5 * 10 = 50
