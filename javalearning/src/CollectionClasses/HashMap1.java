package CollectionClasses;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap1 {
	
	public static void main(String[] args) {
		m1();
	}
    
	public static void m1()
	{
		String s="Rajarajeshwari";
		String s1="";
		char[] arr=s.toCharArray();
		
		HashMap a1=new HashMap();
		HashMap a2=new HashMap();
		int index=1;
		for (int i = 0; i < arr.length; i++) {
			if (!a1.containsValue(arr[i])) {
			   a1.put(index, arr[i]);
			   index++;
			}
			else
			{
				if (!a2.containsValue(arr[i])) {
					   a2.put(i, arr[i]);
					   
					}
			}
		}
		
		System.out.println(a2);
		System.out.println(a1);
		for(Object obj:a1.values())
		{
			System.out.println(obj);
		}
		
	}
}
