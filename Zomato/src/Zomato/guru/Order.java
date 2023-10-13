package Zomato.guru;

abstract public class Order {

	static int idly = 10;
	static int dosa = 40;
	static int rice = 30;
	static int chicken = 100;
	static int sambar = 20;

	public static void menu()
	{
		System.out.println("idly = 10");
		System.out.println("dosa = 10");
		System.out.println("rice = 10");
		System.out.println("chicken = 10");
		System.out.println("sambar = 10");
		System.out.println("-----------------------");
	}
	

	abstract public void cart();

}
