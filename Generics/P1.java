package Generics;
class Box<T>{
	T height;
	T width;
	public T getHeight() {
		return height;
	}
	public void setHeight(T height) {
		this.height = height;
	}
	public T getWidth() {
		return width;
	}
	public void setWidth(T width) {
		this.width = width;
	}
}
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> b1 = new Box();
		b1.setHeight(50);
		b1.setWidth(50);
		System.out.println("Height: "+b1.getHeight());
		System.out.println("Width: "+b1.getWidth());
		Box<Double> b2 = new Box();
		b2.setHeight(12.2);
		b2.setWidth(12.2);
		System.out.println("Height: "+b2.getHeight());
		System.out.println("Width: "+b2.getWidth());
	}

}
