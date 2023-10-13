package CollectionClasses;

import java.util.ArrayList;

public class Palindrome_No {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(212);
		a1.add(233);
		a1.add(121);
		a1.add(505);
		a1.add(756);

		for (int i = 0; i < a1.size(); i++) {
			Object obj = a1.get(i);

			if (obj instanceof Integer) {
				int a=(int)obj;
                int rem=0,rev=0,temp=a;
				while (a>0)
				{
					rem=a%10;
					rev=(rev*10)+rem;
					a=a/10;
				}
				if (rev==temp) {
					System.out.println(temp);
				}
			}
		}

	}

}
