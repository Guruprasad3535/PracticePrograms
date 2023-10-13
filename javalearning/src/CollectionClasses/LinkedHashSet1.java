package CollectionClasses;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	
	public static void main(String[] args) {
		
		String s="Rajarajeshwari";
		String s1="";
		char[] arr=s.toCharArray();
		
		LinkedHashSet a1=new LinkedHashSet();
		LinkedHashSet a2=new LinkedHashSet();
		int index=1;
		for (int i = 0; i < arr.length; i++) {
			if (!a1.contains(arr[i])) {
			   a1.add(arr[i]);
			}
			else
			{
				if (!a2.contains(arr[i])) {
					   a2.add(arr[i]);
					   
					}
			}
		}
		
		System.out.println(a1);
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
