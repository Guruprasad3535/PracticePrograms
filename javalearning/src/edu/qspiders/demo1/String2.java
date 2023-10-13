package edu.qspiders.demo1;

public class String2 {

	public static void main(String[] args) {

		String s = "aaaabbbbcdddccbbdvhjgjsanljadlfhhhdhdhhhhhdhsahh";

		int index = 0;
		char str[] = s.toCharArray();
		String s1="";

		for (int i = 0; i < str.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (str[i] == str[j]) {
					break;
				}
			}
			if (i != j) {
				s1+=str[i];
			}
		}

		for (int i = 0; i < s1.length(); i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					break;
				}
			}
			if (i == j) {
				System.out.println(s1.charAt(i));
			}
		}

	}

}
