package edu.qspiders.demo1;

public class Null1 {
	
	int a=10;
	
	public static void main(String[] args) {
		Null1 a1=null;
		try {
			System.out.println(a1.a);
			
		} catch (NullPointerException A) {
		
			System.out.println(A.getMessage());
		}
	 
	 System.out.println("main ends");
	}

}
