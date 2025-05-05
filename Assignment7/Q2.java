package Assignment7;
@FunctionalInterface
interface Calculator{
	void calculate(double d1 , double d2);
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = (double d1 , double d2 ) -> {
			System.out.println("Addition of two numbers: "+d1+d2);
			System.out.println("Subtraction of two numbers: "+(d1-d2));
			System.out.println("Multiplication of two numbers: "+d1*d2);
			System.out.println("Division of two numbers: "+d1/d2);
		};
		calc.calculate(40, 20);
	}

}

//OUTPUT
//Addition of two numbers: 40.020.0
//Subtraction of two numbers: 20.0
//Multiplication of two numbers: 800.0
//Division of two numbers: 2.0
