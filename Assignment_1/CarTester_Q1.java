package Assignment_1;
class Car{
	private int make;
	private String model;
	Car(int make , String model){
		this.make = make;
		this.model = model;
	}
	public void setMake(int n) {
		this.make = n;
	}
	public void setModel(String m) {
		this.model = m;
	}
	public void getMake() {
		System.out.println(this.make);
	}
	public void getModel() {
		System.out.println(this.model);
	}
	@Override
	public String toString() {
		return make +" "+model; 
	}
}
public class CarTester_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car(2, "abc");
		Car myCar2 = new Car(0, null);
		System.out.println(myCar1);
		System.out.println(myCar2);
		myCar2.setMake(5);
		myCar2.setModel("def");
		myCar2.getMake();
		myCar2.getModel();
	}

}
