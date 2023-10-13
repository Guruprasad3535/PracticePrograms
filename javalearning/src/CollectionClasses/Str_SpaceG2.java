package CollectionClasses;

import java.util.ArrayList;

public class Str_SpaceG2 {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add("hi how are you");
		a1.add("hi how");
		a1.add("hi how are");
		a1.add("I am fine how are you");

		for (int i = 0; i < a1.size(); i++) {
			Object obj = a1.get(i);

			if (obj instanceof String) {
				String s = (String) obj;
				int count = 0;

				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == ' ') {
						count++;
					}
				}

				if (count > 2) {
					System.out.println(s);
				}
			}
		}

	}

}
