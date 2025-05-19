package p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String config_loc= "bean1.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		System.out.println("Config is loaded");
		Student student = (Student)context.getBean("stdId");
		student.display();
		System.out.println("===============================");
		Student student2 = context.getBean("stdId2" , Student.class);
		System.out.println("Name: "+student2.getName());
		System.out.println("Roll: "+student2.getRollno());
		System.out.println("Email: "+student2.getEmail());
	}

}

//Output
//Config is loaded
//Name: Mayur Ramgir
//Roll: 101
//Email: mayur@gmail.com
//===============================
//Name: Sita Ram
//Roll: 102
//Email: ram@gmail.com

