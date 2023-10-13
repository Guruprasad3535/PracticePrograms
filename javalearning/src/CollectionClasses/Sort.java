package CollectionClasses;

import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		
		LinkedHashSet a1=new LinkedHashSet();
		a1.add(10);
		a1.add(30);
		a1.add(2);
		a1.add(20);
		a1.add(40);
		
		ArrayList a2=new ArrayList(a1);
		
		Collections.sort(a2);
		
		a1.clear();
		a1.addAll(a2);
		System.out.println(a1);
	}
}
