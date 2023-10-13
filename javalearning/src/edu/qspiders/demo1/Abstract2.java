package edu.qspiders.demo1;

public class Abstract2 extends Abstract1

{
  public void m1()
  {
	  System.out.println("in the abstract method");
  }
  
    public static void main(String[] args) 
    {
	  Abstract2 a1=new Abstract2();	
	  a1.m1();
	  Abstract1.m2();
	}
	

}
