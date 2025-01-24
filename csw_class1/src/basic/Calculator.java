package basic;
import java.util.Scanner;

class calculate {
    int num1;
    int num2;

     calculate(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void add() {
        System.out.println("Result: " +num1+num2);
    }
    void subtract() {
        System.out.println("Result: " +(num2-num1));
    }
    void divide() {
        System.out.println("Result: " + "\n" + "   Quotient: "+(num2/num1) +"\n" + "   Remainder: " + (num2%num1));
    }
    void multiply() {
        System.out.println("Result: "+ num1*num2);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        calculate result = new calculate(num1, num2);
        result.add();
        result.subtract();
        result.divide();
        result.multiply();
    }
}
