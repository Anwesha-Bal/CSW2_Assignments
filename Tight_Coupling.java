package Basics;
class Box{
	public int volume;
	Box(int length , int width , int height){
		this.volume = length * width * height; 
	}
}
public class Tight_Coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box(5 , 5, 5);
		System.out.println(b.volume);
	}

}
