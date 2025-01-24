package Basics;

public class static_examples {

	static{
		System.out.println("Static");
	}
	static int square(int s) {
		return s*s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int re = square(5);
		System.out.println(re);
	}
}
