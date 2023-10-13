package CollectionClasses;

import java.util.ArrayList;

public class Only_Double {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();

		a1.add(10);
		a1.add(2.5);
		a1.add(3.5);
		a1.add('g');
		a1.add("guru");
		a1.add('c');

		int count = 0;
        System.out.println("the double data type values from the arraylist are ");
		for (int i = 0; i < a1.size(); i++) {
			Object obj = a1.get(i);
			
			if (obj instanceof Double) {
				System.out.println(obj);
			}
			else if (obj instanceof Character) {
				count++;
			}
		}

		System.out.println("the number of charcters in the arraylist is " + count);

	}

}
