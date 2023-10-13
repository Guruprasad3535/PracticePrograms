package edu.qspiders.demo2;

public class Replace {

	public static void main(String[] args) {
		String s1="Hi How are you";
		char []str=s1.toCharArray();
		
		for (int i = 0; i < str.length; i++) {
			if (str[i]=='H') {
				str[i]='B';
			}
			
		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
	}
}
