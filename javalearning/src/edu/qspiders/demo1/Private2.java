package edu.qspiders.demo1;

public class Private2 
{
	public static void main(String[] args) 
	{
	  System.out.println(Private1.a);
	  Private1.m1();
	  
	  Private1 a1=new Private1();
	  System.out.println(a1.b);
	  a1.m2();
	}

}
