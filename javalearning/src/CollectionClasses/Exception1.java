package CollectionClasses;

public class Exception1 {

	public static void main(String[] args) {
		
		try
		{
			int a=10,b=0;
			System.out.println(a);
		}
		catch(Exception a) {
			System.out.println(a.getMessage());
		}
		finally
		{
			System.out.println("closed");
		}
	}
}
