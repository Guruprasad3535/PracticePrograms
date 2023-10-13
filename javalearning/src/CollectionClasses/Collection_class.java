package CollectionClasses;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_class {
	
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(25);
		a1.add(20);
		a1.add(50);
		a1.add(70);
		a1.add(60);
		
		
		System.out.println(a1);
		
		Collections.shuffle(a1);
		System.out.println("collection after shuffle "+a1);
		
		Collections.swap(a1, 1, 2);
		System.out.println("collection after swap "+a1);
		
		Collections.sort(a1);
		System.out.println("collection after sort "+a1);
		
		Collections.reverse(a1);
		System.out.println("collection aftet reverse "+a1);
		
		Object [] obj=a1.toArray();
		for (int i = 0; i < obj.length; i++) {
			
			Object a=obj[i];
			Integer num=(Integer)a;
			
			if (num%2==0)
			System.out.println(obj[i]);
		}
		
		ArrayList<String> a2=new ArrayList();
		a2.add("guru");
		a2.add("prasad");
		
		System.out.println(a2);
		
	}

}
