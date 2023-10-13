package CollectionClasses;

import java.util.ArrayList;

public class Palindrome_Str {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add("gvg");
		a1.add("guru");
		a1.add("svs");
		a1.add("ulser");

		for (int i = 0; i < a1.size(); i++) {
			Object obj = a1.get(i);

			if (obj instanceof String) {
				String s = (String) obj;
				String rev = "";

				for (int j = s.length() - 1; j >= 0; j--) {
					rev = rev + s.charAt(j);
				}
				if (rev.equals(s)) {
					System.out.println(s);
				}
			}
		}

	}

}
