package Assignment2_ii;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car>{
	private int modelNo;
	private int stock;
	private String name;
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car(int modelNo, int stock, String name) {
		super();
		this.modelNo = modelNo;
		this.stock = stock;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", stock=" + stock + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Car car) {
		return Integer.compare(this.stock,car.stock);
	}
}
//Q3
public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car(2017, 45, "Audi"));
		cars.add(new Car(2020, 13, "MG"));
		cars.add(new Car(2013, 10, "Creta"));
		cars.add(new Car(2015, 55, "BMW"));
		cars.add(new Car(2018, 20, "Kia"));
		Collections.sort(cars);
		System.out.println("List of sorted Car Objects:");
		for(Car car : cars) {
			System.out.println(car);
		}
	}
}
