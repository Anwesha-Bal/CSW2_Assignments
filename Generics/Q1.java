package Generics;
import java.util.Scanner;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
class MyGeneric<T1 , T2>{
	int val;
	private T1 t1;
	private T2 t2;
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public T1 getT1() {
		return t1;
	}
	public void setT1(T1 t1) {
		this.t1 = t1;
	}
	public T2 getT2() {
		return t2;
	}
	public void setT2(T2 t2) {
		this.t2 = t2;
	}
	public MyGeneric(int val, T1 t1, T2 t2) {
		this.val = val;
		this.t1 = t1;
		this.t2 = t2;
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>arrayList = new ArrayList<Integer>();
		arrayList.add(54);
		arrayList.add(643);
		int a = (int)arrayList.get(0);
		System.out.println(a);
		MyGeneric<String, Integer> g1 = new MyGeneric(24,"Hello",3);
		System.out.println(g1.getVal()+" "+g1.getT1()+" "+g1.getT2());
	}

}
