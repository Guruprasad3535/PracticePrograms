package edu.qspiders.demo1;

import java.util.Scanner;
public class Users 
{ 
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	
	Fb_datab U1=new Fb_datab();
	
	U1.set1("guruprasad");
	U1.set2(3535);
	
	String u_name=U1.get1();
	int pas=U1.get2();
	
	System.out.println("Welcome to Google");
	
	System.out.println("Enter the url ");
	String url=sc.nextLine();
	
	System.out.println("**************************");
	
	System.out.println("Welcome to face book login page\n");
	
	System.out.println("Enter the user name: ");
	String U_name=sc.nextLine();
	
	System.out.println("");
	
	System.out.println("Enter the password: ");
	int password=sc.nextInt();
	
	
	if (u_name.equals(U_name)&&pas==password)
	{
		System.out.println("");
		System.out.println("**************************");
		System.out.println("welcome to home page ");
		System.out.println("Hi,Guru");
		System.out.println("Explore new posts ");
	}
	else
	{
		System.out.println("invalid user name or password");
	}
	
	
  }

}
