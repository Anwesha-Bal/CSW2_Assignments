package LambdaFunctions;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable run1 = new Runnable() {
			public void run() {
				System.out.println("Thread1 is running");
			}
		};
		Thread t1 = new Thread(run1);
		t1.start();
		Runnable run2 = () -> {
			System.out.println("Thread2 is running");
		};
		Thread t2 = new Thread (run2);
		t2.start();
		Runnable run3 = () -> {
			System.out.println("The id of third thread is: ");
			System.out.println(Thread.currentThread().getId());
		};
		Thread t3 = new Thread(run3);
		t3.start();
		Runnable run4 = () -> {
			System.out.println("The class of the fourth thread is: ");
			System.out.println(Thread.currentThread().getClass());
		};
		Thread t4 = new Thread(run4);
		t4.start();
	}
}
