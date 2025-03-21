package Assignmen4;
import java.util.Random;
class Student{
	String name;
	String course;
	int id;
	public Student(String name, String course, int id) {
		super();
		this.name = name;
		this.course = course;
		this.id = id;
	}
	void printData() {
		 System.out.println("name: "+name);
		 System.out.println("course: "+course);
		 System.out.println("id: "+id);
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Garbage collection is successful for "+this.name +  " " + this.course+" "+this.id);
	}
}
public class Q7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Raju","CSE", 2341);
		s1.printData();
		s1 = null;
		System.gc();
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Total Memory: "+runtime.totalMemory());
		System.out.println("Free Memory: "+runtime.freeMemory());
		System.out.println("Used Memory: "+(runtime.totalMemory()-runtime.freeMemory()));
	}
}
