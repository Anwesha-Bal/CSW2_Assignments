package string;

import java.util.GregorianCalendar;
public class Calender {
	public static void runStringBuilder(StringBuilder myStr) {
		long begin = new GregorianCalendar().getTimeInMillis();
		long initiateMemory = Runtime.getRuntime().freeMemory();
		for(int j = 0 ; j<50000000 ; j++) {
			myStr.append(": "+j);
		}
		long finish = new GregorianCalendar().getTimeInMillis();
		long stopMemory = Runtime.getRuntime().freeMemory();
		System.out.println("Time taken for string builder append insert: "+(finish-begin));
		System.out.println("Time taken for string builder append insert: "+(initiateMemory-stopMemory));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.gc();
		StringBuffer myBuffer = new StringBuffer();
		StringBuilder myBuilder = new StringBuilder();
		runStringBuilder(myBuilder);
		System.gc();
		runStringBuffer(myBuffer);
	}
	public static void runStringBuffer(StringBuffer mybBuffer) {
		long begin = new GregorianCalendar().getTimeInMillis();
		long initiateMemory = Runtime.getRuntime().freeMemory();
		for(int j = 0 ; j<50000000 ; j++) {
			mybBuffer.append(": "+j);
		}
		long finish = new GregorianCalendar().getTimeInMillis();
		long stopMemory = Runtime.getRuntime().freeMemory();
		System.out.println("Time taken for string builder append insert: "+(finish-begin));
		System.out.println("Time taken for string builder append insert: "+(initiateMemory-stopMemory));
	}

}
