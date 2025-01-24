package Basics;
class Tree{
	public void print () {
		System.out.println("Trees are lungs of earth");
	}
}
class Mango extends Tree{
	public void getInfo() {
		System.out.println("Mangoes are sweet");
	}
	
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mango m = new Mango();
		m.print();
		m.getInfo(); 
	}

}
