package Basics;
class Animal1{
	public void displayInfo() {
		System.out.println("I am an animal.");
	}
}
class Dog extends Animal1{
	@Override
	public void displayInfo() {
		System.out.println("I am a dog.");
	}
}
public class Run_ply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.displayInfo();
	}

}
