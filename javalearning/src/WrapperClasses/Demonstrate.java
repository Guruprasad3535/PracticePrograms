package WrapperClasses;

public class Demonstrate {
	
	public static void main(String[] args) {
		
		//****boxing***//
		int a=10;
		
		Integer b=a;// implicit boxing
		System.out.println(b);
		
		double c=20.4;
		 Double d=Double.valueOf(c);//explicit boxing
		System.out.println(d);
		
		//**unboxing**//
		
		int x=b;//implict unboxing
		System.out.println(x);
		
		double y=d.doubleValue();
		System.out.println(y);
	}

}
