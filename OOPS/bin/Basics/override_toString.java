package Basics;
class Stud{
	int rollno;
	String name;
	String city;
	Stud(int roll , String name ,String city){
		this.rollno = roll;
		this.name = name;
		this.city = city;
	}
	public String toString() {
		return rollno+" "+name+" "+city;
	}
}
public class override_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s1 = new Stud(101, "Raj", "lucknow");
		Stud s2 = new Stud(102, "Vijay", "ghaziabad");
		System.out.println(s1);
		System.out.println(s2);
	}

}
