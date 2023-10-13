package StringClass;

public class CoutWord {

	public static void main(String[] args) {
		
		String s="hi how are you";
		
		String [] str=s.split(" ");
		int count=0;
		
		for (int i = 0; i < str.length; i++) {
			
			count++;
			
		}
		
		System.out.println("the number of words in the given string is "+count);
	}
}
