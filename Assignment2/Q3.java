package Assignment2;
import java.util.*;

class Car implements Comparable<Car>{
	private String model;
	private String colour;
	private int speed;
	public Car(String model, String colour, int speed) {
		super();
		this.model = model;
		this.colour = colour;
		this.speed = speed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", colour=" + colour + ", speed=" + speed + "]";
	}
	public int compareTo(Car otherCar) {
		return Integer.compare(this.speed, otherCar.speed);
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car[]cars = {new Car("Toyota", "Red", 180), new Car("Honda", "Blue", 200)};
//		Arrays.sort(cars);
//		System.out.println("Car with highest speed: "+cars[cars.length-1]);
		ArrayList<Car> car_new = new ArrayList<>();
		car_new.add(new Car("Toyota", "Red", 180));
		car_new.add(new Car("Honda", "Blue", 200));
		Collections.sort(car_new);
		System.out.println("Car with higest speed: "+car_new.get(car_new.size()-1));
	}

}
