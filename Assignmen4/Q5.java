package Assignmen4;
import java.util.Random;
class ex{
	private int intValue;
	private double doubleValue;
	 ex() {
		// TODO Auto-generated constructor stub
		 this.intValue = 0;
		 this.doubleValue = 0.0;
	}
	 void setData(int i , double d) {
		 this.intValue = i;
		 this.doubleValue = d;
	 }
	 void updateIntValue(int i) {
		 this.intValue = i;
	 }
	 void updateDoubleValue(double d) {
		 this.doubleValue = d;
	 }
	 void printData() {
		 System.out.println("Integer Value: "+intValue);
		 System.out.println("Double value: "+doubleValue);
	 }
}
public class Q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
