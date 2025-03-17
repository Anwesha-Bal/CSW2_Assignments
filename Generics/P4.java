package Generics;
class Pair<T,U>{
	T x;
	U y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public U getY() {
		return y;
	}
	public void setY(U y) {
		this.y = y;
	}
	public Pair(T x, U y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Pair [x=" + x + ", y=" + y + "]";
	}
	
	
}
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair  <Integer,String> p1 = new Pair(02, "Anwesha");
		System.out.println(p1);
		Pair <Double , Character> p2 = new Pair(89.4, 'A');
		System.out.println(p2);
	}

}
