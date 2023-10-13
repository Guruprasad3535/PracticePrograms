package CollectionClasses;

import java.util.ArrayList;

public class Length_G5 {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add("pul");
		a1.add("nalsar");
		a1.add("boxer");
		a1.add("ulser");

		for (int i = 0; i < a1.size(); i++) {
			Object obj = a1.get(i);

			if (obj instanceof String) {
				String s = (String) obj;
				if (s.length()>5) {
					System.out.println(s);
				}
			}
		}

	}

}
