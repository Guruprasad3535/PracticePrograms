package edu.qspiders.demo1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1="listen";
		String s2="silent";
		boolean flag=true;
		char temp;
		
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		
		if (a1.length!=a2.length)
		{
			flag=false;
		}
		
		for (int i = 0; i < a1.length; i++) {
			for (int j=i+1; j < a1.length; j++) {
				if (a1[i]>a1[j])
				{
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
			System.out.print(a1[i]);
		}
		System.out.println();
		for (int i = 0; i < a2.length; i++) {
			for (int j=i+1; j < a2.length; j++) {
				if (a2[i]>a2[j])
				{
					temp=a2[i];
					a2[i]=a2[j];
					a2[j]=temp;
				}
			}
			System.out.print(a2[i]);
		}
		System.out.println();
		
		for (int i = 0; i < a1.length; i++) {
			
			if (a1[i]!=a2[i])
			{
				flag=false;
			}
		}
		
		if (flag)
		{
			System.out.println("it is anagram ");
		}
		else
		{
			System.out.println("it is not a anagram");
		}
	}

}
