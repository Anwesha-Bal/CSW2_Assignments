package garbage_collector;
public class Ex4 {
	public void msg(String m) {
		System.out.println(m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4 a = new Ex4();
		a.msg("normal object");
		new Ex4().msg("Anonymous Object");
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                