package edu.qspiders.demo2;

public class X1 {
	public static void main(String[] args) {
		m1();
	}

	public static void m1()
	{
		System.out.println("m1 starts");
		try
		{
			m2();
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("m1 ends");
	}
	public static void m2()
	{
		System.out.println("m2 starts");
		try
		{
			m3();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("hi");
			System.out.println(e.getMessage());
		}
		
		System.out.println("m2 ends");
	}
	public static void m3()
	{
		System.out.println("m3 starts");
		System.out.println(1/0);
		System.out.println("m3 ends");
	}
}
