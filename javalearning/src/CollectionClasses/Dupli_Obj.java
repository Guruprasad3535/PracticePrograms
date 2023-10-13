package CollectionClasses;

import java.util.ArrayList;
import java.util.HashSet;

public class Dupli_Obj {
          
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add("guru");
		a1.add("guruprasad");
		a1.add("guru");
		a1.add("prasad");
		a1.add("aravind");
		System.out.println("Collection before removing dupli "+a1);
		
		for (int i = 0; i < a1.size(); i++) {
			
			Object obj=a1.get(i);
			int j;
			for (j=0; j < i; j++) {
				
				Object obj1=a1.get(j);
				if (obj.equals(obj1))
				{
					break;
				}
			}
			if (i!=j)
			{
				a1.remove(i);
			}
		}
		//HashSet a2 = new HashSet(a1);

		//a1.clear();

		//a1.addAll(a2);
		System.out.println(a1);
		System.out.println("after removing dupi "+a1);
		
	}
}
