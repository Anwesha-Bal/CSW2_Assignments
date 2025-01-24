package Basics;
class Account{
	private int acc_no;
	private String name;
	private String email;
	private double amount;
	public void setacc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public void set_name(String name) {
		this.name = name;
	}
	public void set_email(String email) {
		this.email = email;
	}
	public void set_amount(double amount) {
		this.amount = amount;
	}
	public void getacc_no() {
		System.out.println("Account number is: "+this.acc_no);
	}
	public void get_name() {
		System.out.println("Name is: "+this.name);
	}
	public void get_email() {
		System.out.println("Email is: "+this.email);
	}
	public void get_amount() {
		System.out.println("Amount is: "+this.amount);
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.setacc_no(1267535);
		a.set_name("Anwesha");
		a.set_email("anwesha@gmail.com");
		a.set_amount(9323626.00);
		a.get_name();
		a.get_email();
		a.getacc_no();
		a.get_amount();
		
	}

}
