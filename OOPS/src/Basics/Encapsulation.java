package Basics;
//Hiding data
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud1 s1= new stud1();
		s1.setName("Roe");
		System.out.println(s1.getName());
	}

}
class stud1{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
