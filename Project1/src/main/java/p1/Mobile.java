package p1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("Config is loaded");
		Sim sim1 = (Sim)context.getBean("Sim1");
		sim1.calling();
		sim1.data();
		
		Sim sim2 = (Sim)context.getBean("Sim2");
		sim2.calling();
		sim2.data();
		
	}

}
