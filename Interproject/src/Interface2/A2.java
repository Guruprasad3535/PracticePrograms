package Interface2;

public class A2 extends A1
{

	@Override
	public void mul() {
		System.out.println(a*b);
		
	}
	
	public static void main(String[] args) {
		A2 a1=new A2();
	    
		a1.sub();
		a1.mul();
		a1.add();
		
		System.out.println(a+""+b);
	}

	
	public void add() {
		System.out.println(a+b);
		
	}

}
