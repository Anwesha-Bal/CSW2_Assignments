package Basics;
final class Animal{
	final int leg = 4;
	final void sound() {
		System.out.println("Animal makes sound");
	}
}
public class final_n {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		System.out.println("Animal legs: "+a.leg);
		//a.leg = 5;
	}
	}