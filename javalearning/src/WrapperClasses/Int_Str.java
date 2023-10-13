package WrapperClasses;

public class Int_Str {

	public static void main(String[] args) {

		int a = 10;

		String s = String.valueOf(a);
		System.out.println(s);

		int b = 20;
          
		Integer c = Integer.valueOf(b);
		
		String str = c.toString();
		System.out.println(str);
		System.out.println(str.length());

	}

}
