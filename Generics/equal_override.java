package Generics;

import java.security.PublicKey;
import java.util.zip.CRC32;

class Car{
	private String brand;
	private String model;
	private String registrationNumber;
	public Car(String brand, String model, String registrationNumber) {
		super();
		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public boolean equals(Object o) {
		if(o instanceof Car) {
			Car car = (Car) o;
			if(car.getBrand()==this.brand && car.getModel()==this.model && car.getRegistrationNumber()== this.registrationNumber) {
				return true;
			}
			else {
				return false;
			}
		}
		else { 
			return false;
		}  
	}
	public int hashCode(){
		return brand.length()-1;
	}
}
public class equal_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("Mercedez Benz", "S class", "MH05 12345");
		Car myInGarage = new Car("Mercedez Benz", "S class", "MH05 12345");
		if(myCar.equals(myInGarage)) {
			System.out.println("Yay!! This is my car");
		}
		else {
			System.out.println("Yay!! This is my car");
		}
		System.out.println(myCar.hashCode());
	}
}
