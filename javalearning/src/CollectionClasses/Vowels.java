package CollectionClasses;

import java.util.ArrayList;

public class Vowels {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add('a');
		a1.add('e');
		a1.add('s');
		a1.add('f');
		a1.add('u');

		for (int i = 0; i < a1.size(); i++) {
			Object obj = a1.get(i);

			if (obj instanceof Character) {
				Character ch=(Character)obj;
                
				if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					System.out.println(ch);
				}
			}
		}

	}

}
