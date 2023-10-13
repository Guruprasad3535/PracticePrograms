package edu.qspiders.demo1;

public class String1 {
    
public static void main(String[] args) {
	String s="guru";
	
	System.out.println(s.charAt(0)+""+s.charAt(1)+""+s.charAt(2)+""+s.charAt(3));
	
	try {
		System.out.println(s.charAt(4));
	} catch (StringIndexOutOfBoundsException A) {
		System.out.println(A.getMessage());
	}
	System.out.println("main ends");
}	
	

}
