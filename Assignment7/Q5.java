package Assignment7;
import java.util.function.Function;
public class Q5 {
	public static Function<Integer,Integer>getSquaredFunction(){
		return (Integer n) ->
		n*n;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function <Integer,Integer> squareFunction = getSquaredFunction();
		int[]number = {2,2,4,5,6};
		System.out.println("Square of numbers");
		for(int num: number) {
			System.out.println("Square of "+num+" is "+squareFunction.apply(num));
		}
	}

}
