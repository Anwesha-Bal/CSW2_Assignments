package Assignment2_ii;
class Pair<K,V>{
	private K key ;
	private V value ;
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair <String , Integer> pair = new Pair<>("Example",42);
		Pair <Integer , Double> pair1 = new Pair<>(4,4.5);
		System.out.println("Key: "+pair.getKey()+" Value: "+pair.getValue());
		System.out.println("Key: "+pair1.getKey()+" Value: "+pair1.getValue());
	}

}
