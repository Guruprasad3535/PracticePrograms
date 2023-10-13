package CollectionClasses;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeSet1 {
	
	public static void main(String[] args) {
		
		TreeSet a1=new TreeSet();
		a1.add(10);
		a1.add(5);
		a1.add(20);
		a1.add(7);
		
		List a2=new ArrayList(a1);
		Collections.reverse(a2);
		
		System.out.println(a2);
		a1.clear();
		a1.addAll(a2);
		System.out.println(a1);
	}

}
