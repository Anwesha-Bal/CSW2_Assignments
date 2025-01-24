package Basics;
//Only shows the necessary part
abstract class Animal1{ //Used in strong couple class
	void eat () {
		System.out.println("The animal eats.");
		}
	abstract void sound();
}
class Dog1 extends Animal1{
	void sound() {
		System.out.println("Dog barks.");
	}
}
interface Flyable{ //Used in loose couple class
	void fly();
}
class Bird implements Flyable{
	public void fly() {
		System.out.println("Bird flies.");
	}
}
class Airplane implements Flyable{
	public void fly() {
		System.out.println("Airplane flies. ");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d = new Dog1();
		d.eat();
		d.sound();
		Airplane a = new Airplane();
		a.fly();
		Bird b = new Bird();
		b.fly();
	}

}
