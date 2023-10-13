package CollectionClasses;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class String_dup {

	public static void main(String[] args) {

		// String s="Rajarajeshwari";
		// HashSet<Character> ch=new HashSet();
		// for (int i = 0; i < s.length(); i++) {
		// ch.add(s.charAt(i));
		// }
		// Iterator itr=ch.iterator();
		// while(itr.hasNext())
		// {
		// System.out.print(itr.next());
		// }
		String s = "Rajarajeshwari";
		ArrayList<Character> a1 = new ArrayList();
		
		for (int i = 0; i < s.length(); i++) {
			
			a1.add(s.charAt(i));
		}
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		String s1="";
		
		for (int j = 0; j < a1.size(); j++) {
			
			Object obj=a1.get(j);
			int k;
			for (k = 0; k < j; k++) {
				Object obj1=a1.get(k);
				
				if(obj.equals(obj1))
				{
					break;
				}
				
			}
			if(j==k)
			{
				s1+=obj;
			}
		}
		System.out.println(s1);
	}
}
