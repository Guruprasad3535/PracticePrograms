package edu.qspiders.demo2;

import edu.qspiders.demo1.Private1;

public class Private3 extends Private1
{
	public static void main(String[] args) 
	 {
		 System.out.println(Private1.a);
		 Private1.m1();
		  
		 Private3 a1=new Private3();
		 System.out.println(a1.b);
		 a1.m2();
	 }

}
