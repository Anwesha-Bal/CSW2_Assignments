package Assignment2;

import java.util.ArrayList;
import java.util.Comparator;

class Student7{
	String name;
	int rollno ;
	int age;
	public Student7(String name, int rollno, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student7 [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
	}
}
class StudentRollNoComparator implements Comparator<Student7>{
	@Override
	public int compare(Student7 s1 , Student7 s2) {
		return Integer.compare(s1.rollno , s2.rollno);
	}
}
class StudentAgeComparator implements Comparator<Student7>{
	@Override
	public int compare(Student7 s1 , Student7 s2) {
		return Integer.compare(s1.age , s2.age);
	}
}
class StudentAgeRollNoComparator implements Comparator<Student7>{
	@Override
	public int compare(Student7 s1 , Student7 s2) {
		int ageComparison = Integer.compare(s1.age, s2.age);
		if(ageComparison==0) {
			return Integer.compare(s1.rollno , s2.rollno); 
		}
		return ageComparison;
	}
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student7> studentsArrayList = new ArrayList<Student7>();
		studentsArrayList.add(new Student7("P1", 3, 20));
		studentsArrayList.add(new Student7("P2", 1, 22));
		studentsArrayList.add(new Student7("P3", 2, 21));
		studentsArrayList.add(new Student7("P4", 4, 20));
		studentsArrayList.add(new Student7("P5", 5, 20));
		studentsArrayList.sort(new StudentAgeComparator());
		System.out.println("Student sorted by Age:");
		for(Student7 student7 : studentsArrayList) {
			System.out.println(student7);
		}
		studentsArrayList.sort(new StudentRollNoComparator());
		System.out.println("Student sorted by Roll No.:");
		for(Student7 student7 : studentsArrayList) {
			System.out.println(student7);
		}
		studentsArrayList.sort(new StudentAgeRollNoComparator());
		System.out.println("Student sorted by Age and Roll No.:");
		for(Student7 student7 : studentsArrayList) {
			System.out.println(student7);
		}
	}

}
