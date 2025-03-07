package Assignment2_ii;
import java.util.PriorityQueue;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,2,10,8,7,3,4,6,5,9};
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		for(int num : arr) {
			p.add(num);
		}
		System.out.println("Min heap create from the array");
		System.out.println(p);
		System.out.println("Dequeue elements of Priority Queue (Min Heap): ");
		while(!p.isEmpty()) {
			int min = p.poll();
			System.out.print(min+" ");
			System.out.println(p);
		}
	}

}
