package LambdaFunctions;
import java.util.*;
import java.util.function.Function;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1,2,3,4,5);
		//Example of a higher order function: map
		List<Integer> squaredNumbers = map(numbers , x -> x*x);
		//Example of pure function:sum
		System.out.println("Squared numbers: "+squaredNumbers);
		int sum = sum(numbers);
		System.out.println("Sum of numbers: "+sum);
	}
	public static <T,R> List<R> map(List<T>list , Function<T,R> mapper){
		List<R> result = new ArrayList<>();
		for(T item : list) {
			result.add(mapper.apply(item));
		}
		return result;
	}
	public static int sum(List<Integer> numbers) {
		int result = 0;
		for(int number : numbers) {
			result += number; 
		}
		return result;
	}

}

//Output
//Squared numbers: [1, 4, 9, 16, 25]
//Sum of numbers: 15

