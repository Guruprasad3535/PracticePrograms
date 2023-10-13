package edu.qspiders.demo1;

public class Prgm1 
{
	public static int a=10;
	public int b=20;
	
	public static void m1()
	{
		System.out.println("in the static method");
	}
	
	public void m2()
	{
		System.out.println("in the non static method");
	}

   public static void main(String[] args) 
   {
	 System.out.println(a);
	 m1();
	 
	 Prgm1 a1=new Prgm1();
	 System.out.println(a1.b);
	 a1.m2();
   }
}
