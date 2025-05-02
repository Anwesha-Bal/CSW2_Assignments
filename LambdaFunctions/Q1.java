package LambdaFunctions;

public class Q1 {
	interface PrintingSomeText{
		void print(String anyValue);
	}
	public void printLambdaText(String lambdaText, PrintingSomeText pst) {
		pst.print(lambdaText);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 lmd1 = new Q1();
		String lambdaText = "Understanding Lambdas";
		PrintingSomeText pst = (String letsPrint)->{
			System.out.println(letsPrint);
		};
		lmd1.printLambdaText(lambdaText, pst);
	}

}

//OUTPUT
//Understanding Lambdas
