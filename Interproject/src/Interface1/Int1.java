package Interface1;

public interface Int1 
{
  int a=10;
  int b=2;
   
   public static void m1()
   {
	   System.out.println("guru");
   }
   
   
   public void sub();
   
   public void mul();
   
   public static void main(String[] args) {
	m1();
	System.out.println(a);
	///a=15; can't assign
}
}
