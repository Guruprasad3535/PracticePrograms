package Zomato.guru;

import java.util.Scanner;

public class User extends Order implements Intpay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Zlogin a1=new Zlogin();
		
		a1.set1("guruprasad");
		a1.set2(3535);
		
		String U_name=a1.get1();
		int password=a1.get2();
		
		System.out.println("Welcome to Zomato");
		
		System.out.println("Enter the Username: ");
		String u_name=sc.nextLine();
		
		System.out.println("Enter the passwprd");
        int pass=sc.nextInt();
        
        if (U_name.equals(u_name)&&password==pass)
        {
        	System.out.println("Hi,Guru");
        	System.out.println("Search for items");
        	System.out.println("-----------------------------");
        	
        	User a2=new User();
        	
        	a2.cart();
        	a2.payment();
        }
        else
        {
        	System.out.println("Invalid username or password");
        }
	}

	
	public void cart() {
       Scanner sc=new Scanner(System.in);
       menu();
       
	  System.out.println("Select the items");
	  
	  
		
		
	}

	
	public void payment() 
	{
		System.out.println("in the payment");
	}

}
