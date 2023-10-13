package CollectionClasses;

import java.util.PriorityQueue;

public class Quene1 {

	public static void main(String[] args) {
		
		PriorityQueue a1=new PriorityQueue();
		a1.add(40);
		a1.add(20);
		a1.add(30);
		a1.add(10);
		a1.add(4);
		System.out.println(a1);
		
		System.out.println(a1.poll());
		System.out.println(a1);
		System.out.println(a1.element());
		System.out.println(a1);
		
		for(Object obj:a1)
		{
			System.out.println(obj);
		}
	}
}
