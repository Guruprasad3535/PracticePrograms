package CollectionClasses;

import java.util.ArrayList;

public class Str_sar {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add("pulsar");
		a1.add("nalsar");
		a1.add("boxer");
		a1.add("ulser");

		for (int i = 0; i < a1.size(); i++) {
			Object obj = a1.get(i);

			if (obj instanceof String) {
				String s = (String) obj;
				if (s.substring(s.length() - 3).equals("sar")) {
					System.out.println(s);
				}
			}
		}

	}

}
