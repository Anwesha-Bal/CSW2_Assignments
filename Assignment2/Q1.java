package Assignment2;
class Student<T>{
	private String nameString;
	private T rollNo;
	private int age;
	public Student(String nameString, T rollNo, int age) {
		super();
		this.nameString = nameString;
		this.rollNo = rollNo;
		this.age = age;
	}
	public String getNameString() {
		return nameString;
	}
	public T getRollNo() {
		return rollNo;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Student [nameString=" + nameString + ", rollNo=" + rollNo + ", age=" + age + "]";
	}
	
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student <Integer> student1 = new Student("Alice", 101, 20); 
	Student <Integer> student2 = new Student("Bob", 102, 21); 
	
	Student <String> student3 = new Student("Alice","a" , 22);
	Student <String> student4 = new Student("Bob","b" , 23);
	
	System.out.println(student1);
	System.out.println(student2);
	System.out.println(student3);
	System.out.println(student4);
	}

}
