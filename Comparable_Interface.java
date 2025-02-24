package Generics;

import java.awt.print.Printable;
import java.lang.reflect.Array;
import java.util.Arrays;

import Basics.static_examples;

public class Comparable_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		MyPair[] arr = new MyPair[n];
		arr[0]= new MyPair("abc",3);
		arr[1]=new MyPair("a",4);
		arr[2]=new MyPair("bc",5);
		arr[3]=new MyPair("a",2);
		Arrays.sort(arr);
		print(arr);
	}
	public static void print(MyPair[]arr) {
		for(MyPair pair : arr) {
			System.out.println(pair);
		}
	}
}
class MyPair implements Comparable<MyPair>{
	String key;
	int value;
	public MyPair(String key , int value) {
		this.key = key;
		this.value = value;
	}
	public String toString() {
		return "(" + key + ","+value+")";
	}
@Override
	public int compareTo(MyPair other) {
	int keyComparision = this.key.compareTo(other.key);
	if(keyComparision!=0) {
		return keyComparision;
	}
	else {
		return Integer.compare(this.value, other.value);
	}
}
}
