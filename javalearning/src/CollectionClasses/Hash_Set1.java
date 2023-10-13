package CollectionClasses;
import java.util.HashSet;

import java.util.Iterator;

public class Hash_Set1 {
	
	public static void main(String[] args) {
		
		HashSet a1=new HashSet();
		a1.add(10);
		a1.add(25);
		a1.add(20);
		a1.add(50);
		a1.add(70);
		a1.add(60);
		
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
	}
	
	

}
