package Interface2;

public class ClassInt implements Int3,Int3.Int4
{

	@Override
	public void m2() {
		System.out.println("implements of Int3");
		
	}

	@Override
	public void m1() {
		System.out.println("implements of inside Int4");
		
	}

	@Override
	public void add() {
		System.out.println("the add of 2 no "+(a+b));
		
	}

	@Override
	public void sub() {
		System.out.println("the sub of 2 no "+(a-b));
		
	}

}
