package CollectionClasses;

import java.util.ArrayList;

public class Prime_No {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(2);
		a1.add(11);
		a1.add(5);
		a1.add(7);

		for (int i = 0; i < a1.size(); i++) {
			Object obj = a1.get(i);

			if (obj instanceof Integer) {
				int a=(int)obj;
                int count=0;
				for (int j = 1; j <=a; j++) {
					if (a%j==0)
					{
						count++;
					}
				}
				if (count==2) {
					System.out.println(a);
				}
			}
		}

	}

}
