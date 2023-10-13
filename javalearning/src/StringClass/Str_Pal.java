package StringClass;

import java.util.Scanner;

public class Str_Pal {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
        
		String str="";
		
		for (int i = s.length()-1; i>=0; i--) {
			str=str+s.charAt(i);
		}
		System.out.println(s);
		if (str.equals(s)) {
			System.out.println("it is a pal "+str);
		}
		else
		{
			System.out.println("it is not a pal "+str);
		}
		
	}

}
