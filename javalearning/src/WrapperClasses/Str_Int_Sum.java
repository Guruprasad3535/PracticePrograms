package WrapperClasses;

public class Str_Int_Sum {
	
	static int sum=0;

	public static void main(String[] args) {
		
		String s="123";
		
		Integer a=Integer.parseInt(s);
		System.out.println(a);
		
		m1(a);
		System.out.println(sum);
	}
	
	public static void m1(int a)
	{
		int rem=0;
		System.out.println(a);
		if (a>0)
		{
			rem=a%10;
			sum=sum+rem;
			a=a/10;
			m1(a);
			System.out.println("hi");
		}
		
	}
}
