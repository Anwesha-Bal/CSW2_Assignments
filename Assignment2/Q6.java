package Assignment2;

import java.lang.classfile.AnnotationValue.OfBoolean;
import java.util.Objects;

import Basics.static_examples;

class Animal{
	private String name;
	private String color;
	private String type;
	public Animal(String name, String color, String type) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getType() {
		return type;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null || getClass()!=obj.getClass()) {
			return false;
		}
		Animal animal = (Animal) obj;
		return Objects.equals(name, animal.name) && Objects.equals(name, animal.color) && Objects.equals(name, animal.type);
	}
	@Override
	public int hashCode(){
		int hash = 7;
		hash = 31*hash + Objects.hashCode(name);
		hash = 31*hash + Objects.hashCode(color);
		hash = 31*hash + Objects.hashCode(type);
		return hash;
	}
	@Override
	public String toString() {
		return name +" "+ color +" "+ type ;
	}
}
public class Q6 {
	public static void main(String[]args) {
		Animal dog1 = new Animal("Bingo","Brown","pet");
		Animal dog2 = new Animal("Bingo","Brown","pet");
		System.out.println("Details: "+dog1);
		System.out.println("Hashcode: "+dog1.hashCode());
		System.out.println("Details: "+dog2);
		System.out.println("Hashcode: "+dog2.hashCode());
		if(dog1.hashCode()==dog2.hashCode()) {
			System.out.println("Object with same hash code may or may not be equal.");
			System.out.println("Chencking if dog1 and dog2 are equal: "+dog1.equals(dog2));
		}
		else {
			System.out.println("Objects with different hashcodes are not equal.");
		}
	}
}
