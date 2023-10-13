package CollectionClasses;

import java.util.ArrayList;

public class User {
	
	public static void main(String[] args) {
		
		Book a1=new Book("Harry Potar", "Dr.Guru", 1, 234);
		Book a2=new Book("Jungel Book", "Dr.Prasad", 5, 555.9);
		Book a3=new Book("Iron Man", "Dr.V", 7, 1000);
		
		ArrayList a4=new ArrayList();
		a4.add(a1);
		a4.add(a2);
		a4.add(a3);
		
		for (Object obj : a4) {
			System.out.println(obj);	
		}
		
	}

}
