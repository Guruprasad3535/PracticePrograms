package CollectionClasses;

import java.util.ArrayList;

public class Demon_Link_Int {

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
		
		a1.add(0,20);
		System.out.println("after adding 20 in 0th index of a1 "+a1);
		
		a1.remove(0);
		System.out.println("after removing 0th index from a1 "+a1);
		
		a1.addAll(0,a2);
		System.out.println("after adding a2 in a1 in 0th index "+a1);
		
		a1.removeAll(a2);
		System.out.println(a1);
		
		System.out.println("the value of 0th index from a1 is "+a1.get(0));
		
		a1.set(0,20);
		System.out.println("after re-set of 0th index of a1 "+a1);
		
		System.out.println("the index of 2.5 in a1 ia "+a1.indexOf(2.5));
		
		System.out.println("the last apperance of false is "+a1.lastIndexOf(false));
	}
}
