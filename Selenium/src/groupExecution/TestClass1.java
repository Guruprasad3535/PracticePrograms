package groupExecution;

import org.testng.annotations.Test;

public class TestClass1 {

	@Test(groups = {"smoke","Regression"})
	public void demo1() {
		
		System.out.println("Testclass1-smoke1");
	}
	
	@Test(groups = "Regression")
	public void demo2() {
		System.out.println("Testclass1-demo2");
	}
	
	@Test(groups = "smoke")
	public void demo3() {
		System.out.println("Testclass1-smoke3");
	}
	
	@Test(groups = "smoke")
	public void demo4() {
		System.out.println("TestClass1-smoke4");
	}
}
