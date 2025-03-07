package Assignment2_ii;
import java.util.*;
class Address{
	int plotNO;
	String at;
	String post;
	public Address(int plotNO, String at, String post) {
		super();
		this.plotNO = plotNO;
		this.at = at;
		this.post = post;
	}
	public int getPlotNO() {
		return plotNO;
	}
	public String getAt() {
		return at;
	}
	public String getPost() {
		return post;
	}
	@Override
	public String toString() {
		return "Address [plotNO=" + plotNO + ", at=" + at + ", post=" + post + "]";
	}
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TreeMap<String, Address> address = new TreeMap<String, Address>();
	address.put("Shweta", new Address(24, "ctc ", "abc"));
	address.put("Rahul", new Address(12, "bbsr", "def"));
	address.put("Lily", new Address(6, "Kol", "ghi"));
	address.put("Samuel", new Address(3, "Delhi", "852"));
	Iterator<Map.Entry<String, Address>> a = address.entrySet().iterator();
	while(a.hasNext()) {
		String s = a.next().getKey();
		System.out.println(s + " : "+address.get(s));
		}
	}
}
