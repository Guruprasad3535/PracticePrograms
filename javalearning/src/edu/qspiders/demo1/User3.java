package edu.qspiders.demo1;

public class User3 {
public static void main(String[] args) throws NotElibleForVote{
		
		int age=12;
		
		if (age>=18)
		{
			System.out.println("eligable for vote");
		}
		else
		{
			
			throw new NotElibleForVote();
			
				
			
		}
		
}

}
