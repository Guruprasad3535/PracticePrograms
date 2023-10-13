package CollectionClasses;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {

		LinkedList a1 = new LinkedList();
		a1.add(20);
		a1.add("java");
		a1.add('r');
		a1.add(30);

		System.out.println(a1);

		a1.addFirst("guru");
		System.out.println("after adding object in 1 index " + a1);

		a1.addLast("prasad");
		System.out.println("after adding object in last index " + a1);

		System.out.println("after adding at first " + a1.get(1));

		System.out.println(a1.getFirst());

		System.out.println(a1.getLast());

		a1.removeFirst();
		System.out.println("after removing 1 index " + a1);

		a1.removeLast();
		System.out.println("after removing last index " + a1);

		a1.add(0, "guru");
		System.out.println(a1);
		
		System.out.println(a1.get(0));
		
		a1.remove(0);
		System.out.println(a1.get(0));

	}

}
