package StringClass;

import java.util.Iterator;

public class AlphaUpper {
	
	public static void main(String[] args) {
		
		String s="qspider";
		
		s=s.replace('q', 'Q');
		s=s.replace('p', 'P');
		s=s.replace('d','D');
		s=s.replace('r', 'R');
		
		System.out.println(s);
	}

}
