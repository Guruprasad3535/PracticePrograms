package CollectionClasses;
import java.util.Stack;
public class Stack1 {
	
	public static void main(String[] args) {
		
		Stack a1=new Stack();
		a1.push(10);
		a1.push(50);
		a1.push(40);
		a1.push(30);
		a1.push(20);
		
		System.out.println(a1);
		
		System.out.println(a1.pop());
		System.out.println(a1);
		
		System.out.println(a1.peek());
		System.out.println(a1);
		System.out.println(a1.search(30));
		System.out.println(a1.search(10));
		
	}

}
