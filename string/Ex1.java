package string;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ava"; 
		String b = "ava"; 
		boolean ne = a==b;
		System.out.println("Compare using == "+ne);
		String c = new String("ava"); 
		String d = new String("ava");
		boolean e = c==d;
		System.out.println("Compare using == for objects "+e);
		boolean f = c.equals(d);
		System.out.println("Compare using equals for "+" objects "+f);
		b = b.concat("h");
		System.out.println(b);
		b = b.concat(null);
		System.out.println(b);
	}

}
