package StringClass;

public class Str_Num_Pal {
	
	public static void main(String[] args) {
		
		String s="123";
		
		Integer num=Integer.parseInt(s);
		int rem=0,sum=0,temp=num;
		while (num>0) {
			
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		
		if (sum==temp) {
			System.out.println("it is a pal "+sum);
		}
		else
		{
			System.out.println("it is not a pal "+sum);
		}
	}

}
