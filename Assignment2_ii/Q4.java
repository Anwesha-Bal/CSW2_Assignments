package Assignment2_ii;
import java.security.PublicKey;
import java.util.*;

import Basics.static_examples;
class Student_ii{
	private String name;
	private int age;
	private int mark;
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
	public int getmark() {
		return mark;
	}
	public void setMark(int rollno) {
		this.mark = rollno;
	}
	public Student_ii(String name, int age, int mark) {
		super();
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student_ii [name=" + name + ", age=" + age + ", rollno=" +mark + "]";
	}
	
}
public class Q4 {
	public static void displayList(LinkedList<Student_ii> l) {
		for(Student_ii e : l) {
			System.out.println(e);
		}
	}
	public static void searchStudentList(LinkedList<Student_ii> l , Student_ii s) {
		boolean found = l.contains(s);
		System.out.println(found ? "Students found in the list." : "Student not found in the list.");
	}
	public static void removeStudentList(LinkedList<Student_ii> l , Student_ii s) {
		if(l.contains(s)) {
			l.remove(s);
			System.out.println("Student removed from the list.");
		}
		else {
			System.out.println("Student not found in the list.");
		}
	}
	public static int countStudents(LinkedList<Student_ii> l) {
		return l.size();
	}
	public static void checkDuplicatesWithStream(LinkedList<Student_ii> l){
		l.stream().distinct().filter(student -> Collections.frequency(l , student)>1).limit(1).forEach(System.out::println);
	}
	public static void checkDuplicates(LinkedList<Student_ii> l) {
		boolean duplicatefound = false;
		for(Student_ii student : l) {
			if(Collections.frequency(l, student)>1) {
				System.out.println("Without stream checking for duplicate");
				System.out.println(student);
				duplicatefound = true;
				break;
			}
		}
		if(!duplicatefound) {
			System.out.println("No duplicate found");
		}
}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student_ii> student = new LinkedList<Student_ii>();
		Scanner ip = new Scanner(System.in);
		//Add some sample student to the list
		student.add(new Student_ii("Alice", 20, 85));
		student.add(new Student_ii("Bob", 21, 90));
		student.add(new Student_ii("Bob", 21, 90));
		student.add(new Student_ii("Charlie", 19 , 75));
		//(a) Display the list
		System.out.println("Student List: ");
		displayList(student);
		//(b)
		System.out.println("Enter the detail of the student to search (Name , age , mark): ");
		Student_ii searchStudent_ii = new Student_ii(ip.next(), ip.nextInt(), ip.nextInt());
		searchStudentList(student,searchStudent_ii);
		//(c)
		System.out.println("Enter the detail of the student to remove (Name , age , mark): ");
		Student_ii removeStudent_ii = new Student_ii(ip.next(), ip.nextInt(), ip.nextInt());
		removeStudentList(student,removeStudent_ii);
		//(d)
		int count = countStudents(student);
		System.out.println("Number of student in the list: "+count);
		//(e)
		checkDuplicatesWithStream(student);
		checkDuplicates(student);
	}

}
