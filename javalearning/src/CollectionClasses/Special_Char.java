package CollectionClasses;

import java.util.ArrayList;

public class Special_Char {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add('a');
		a1.add('&');
		a1.add('*');
		a1.add('@');
		a1.add('u');
		a1.add('A');

		for (int i = 0; i < a1.size(); i++) {
			Object obj = a1.get(i);

			if (obj instanceof Character) {
				Character ch=(Character)obj;
                
				if (!((ch>='a'&&ch<='z')||(ch>='A'&&ch<='B'))) {
					System.out.println(ch);
				}
			}
		}

	}

}
