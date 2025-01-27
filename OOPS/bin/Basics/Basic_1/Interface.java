package Basic_1;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(2);
		bicycle.speedUp(3);
		bicycle.applyBrake(1);
		System.out.println("Bicycle present state : ");
		bicycle.printStates();
		//create instatnce of bike
		Bike bike = new Bike();
		bike.changeGear(1);
		bike.speedUp(4);
		bike.applyBrake(3);
		System.out.println("Bike present state : ");
		bike.printStates();
	}

}
