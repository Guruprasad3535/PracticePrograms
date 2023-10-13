package CollectionClasses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
public class Hash_Map {
	
	public static void main(String[] args) {
		
		HashMap a1=new HashMap();
		a1.put(1, "guru");
		a1.put(2, 123);
		a1.put(3, "parasd");
		a1.put(4, 'd');
		System.out.println(a1);
		
		Collection a2=a1.values();
		Iterator itr=a2.iterator();
		
		while (itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
		
		System.out.println(a1.get(2));
		a1.remove(4);
		System.out.println(a1);
		System.out.println(a1.containsKey(4));
		System.out.println(a1.containsValue(123));
		System.out.println(a1.size());
		a1.clear();
		System.out.println(a1.isEmpty());
		
		
		
	}

}
