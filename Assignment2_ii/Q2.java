package Assignment2_ii;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;

class User implements Comparable<User>{
	private String name;
	private int age;
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(User u) {
		return Integer.compare(this.age, u.age);
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User>arrayList = new ArrayList<User>();
		arrayList.add(new User("Ankit", 24));
		arrayList.add(new User("Ankita", 20));
		arrayList.add(new User("Rohit", 26));
		arrayList.add(new User("Shyalli", 24));
		for(User e : arrayList) {
			System.out.println("Name: "+e.getName()+" Age: "+e.getAge());
		}
		System.out.println("Sort user by age:");
		User u1 = new User(null , 0);
		Collections.sort(arrayList);
		for(User e : arrayList) {
			System.out.println("Name: "+e.getName()+" Age: "+e.getAge());
		}
	}

}
