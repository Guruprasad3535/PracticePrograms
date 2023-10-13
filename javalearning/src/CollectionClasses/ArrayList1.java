package CollectionClasses;

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		ArrayList a2=new ArrayList();
		a2.add(6);
		a2.add(7);
		
		
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());
		a1.add(a2);
		System.out.println(a1);
		
		
	}

}
