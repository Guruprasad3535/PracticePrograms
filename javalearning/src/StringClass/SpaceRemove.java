package StringClass;

import java.util.Iterator;

public class SpaceRemove {
	
	public static void main(String[] args) {
		
		String s="Hi how are you";
		
		String str="";
		
		for (int i = 0; i < s.length(); i++) {
		
			if (s.charAt(i)!=' ') {
				str=str+s.charAt(i);
			}
		}
		
		System.out.println(str);
	}

}
