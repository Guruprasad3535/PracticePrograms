package edu.qspiders.demo2;

public class StringClass2 {
	
	
public static void main(String[] args) {
	
	String s3=" hi how are ";
	int count=0;
	String [] str=s3.split(" ");
	for (int i = 0; i < str.length; i++) {
		count++;
		System.out.println(str[i]);
}
	System.out.println("no of words in the given string is "+count);
	
}
}
