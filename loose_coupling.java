package Basics;

interface Topic{
	void understand();
}
class Topic1 implements Topic {
	public void understand() {
		System.out.println("Got it");
	}
}
class Topic2 implements Topic{
	public void understand() {
		System.out.println("understand");
	}
}
public class loose_coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Topic topic = new Topic1();
		topic.understand();
		Topic topic1 = new Topic2();
		topic1.understand();
	}

}
