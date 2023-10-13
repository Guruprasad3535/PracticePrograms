package edu.qspiders.demo1;

public class ClassCaste1 extends Null1 {
int b=10;
	public static void main(String[] args) {
		
		Null1 a1=new Null1();
		
		
		try {
			ClassCaste1 a2=(ClassCaste1)a1;
			System.out.println(a2.a);
		} catch (ClassCastException A) {
			System.out.println(A.getMessage());
		}
		
		
		
		
		
		
	}
}
