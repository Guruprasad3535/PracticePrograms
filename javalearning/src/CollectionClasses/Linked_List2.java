package CollectionClasses;

import java.util.LinkedList;

public class Linked_List2 {

	public static void main(String[] args) {

		LinkedList a1 = new LinkedList();
		a1.add(20);
		a1.add("java");
		a1.add('r');
		a1.add(30);

		for (int i = 0; i < a1.size(); i++) {

			Object obj = a1.get(i);

			if (obj instanceof Character) {
				Character ch = (Character) obj;
				if (ch == 'e') {
					System.out.println(obj);
				}

			}
		}

	}
}
