package CollectionClasses;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Dupli_Sent {
	
	public static void main(String[] args) {
		
		String s="i am very very good";
		
		String[] s1=s.split(" ");
		LinkedHashSet a1=new LinkedHashSet();
		
		for (int i = 0; i < s1.length; i++) {
			a1.add(s1[i]);
		}
		String s2="";
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			s2+=itr.next()+" ";
		}
		System.out.println(s2);
	}

}
