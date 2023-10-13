package edu.qspiders.demo2;

public class StringClass3 {
	
	public static void main(String[] args) {
		
		StringBuffer a1=new StringBuffer("java ");
		a1.append("class");
        System.out.println(a1);
        
        StringBuilder a2=new StringBuilder("manual ");
		a2.append("class");
        System.out.println(a2);
        
        String a3=new String("sql ");
		a3.concat("class");
        System.out.println(a3);
        
        
	}

}
