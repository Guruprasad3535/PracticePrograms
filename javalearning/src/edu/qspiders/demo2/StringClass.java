package edu.qspiders.demo2;

import java.util.Iterator;

public class StringClass 
{
public static void main(String[] args) {
	String s1="QSPIDER";
	String s2="qspider";
	String s3="hi how are you";
	
	System.out.println(s1.length());
	System.out.println(s1.charAt(0));
	
	char [] ch=s1.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);	
	}
	System.out.println("");
	
	
	System.out.println(s3.indexOf('h'));
	System.out.println(s1.lastIndexOf('S'));
	System.out.println(s1.substring(1));
	System.out.println(s1.substring(1, 7));
	System.out.println(s1.contains("SPIDER"));
	System.out.println(s1.toLowerCase());
	System.out.println(s2.toUpperCase());
	System.out.println(s1.concat(s2));
	System.out.println(s1.compareTo(s1));
	System.out.println(s1.replace('Q', 'J'));
	System.out.println(s1.startsWith("Q"));
	
	String [] str=s3.split(" ");
	for (int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
	}
}
}
