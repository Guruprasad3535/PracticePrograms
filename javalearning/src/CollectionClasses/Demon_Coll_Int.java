package CollectionClasses;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demon_Coll_Int {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(2.5);
		a1.add('g');
		a1.add(false);
		a1.add("guru");
		System.out.println(a1);

		ArrayList a2 = new ArrayList();
		a2.add(13);
		a2.add(22.5);
		a2.add('r');
		a2.add(true);
		a2.add("prasad");
		System.out.println(a2);

		ArrayList a3 = null;

		System.out.println("the object 10 is present in a1 are not " + a1.contains(10));
		
		a1.addAll(a2);
		System.out.println("after adding a2 into a1 collection "+ a1);
		
		Object a=10;
		a1.remove(a);
		System.out.println("after removing 10 object in a1 collection "+ a1);
		
		System.out.println("is a2 is present in a1 "+a1.containsAll(a2));
		
		a1.removeAll(a2);
		System.out.println("a1 after removing a2 "+a1);
		
		a1.add(0,10);
		System.out.println(a1);
		
		a2.clear();
		System.out.println("after clearing a2 "+a2);
		
		System.out.println("check whether a2 is empty are not "+a2.isEmpty());
		
		System.out.println("the size of a1 array is "+a1.size());
		
		a1.retainAll(a2);
		System.out.println("after reataining a1 by a2 "+a1);
		
		System.out.println("is a1 is instance of arraylist " +(a1 instanceof ArrayList));
		
		System.out.println("is a3 is instance of arraylist " +(a3 instanceof ArrayList));
		
	}

}
