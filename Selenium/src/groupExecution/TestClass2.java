package groupExecution;

import org.testng.annotations.Test;

public class TestClass2 {

	@Test(groups = "Regression")
	public void test1() {
		System.out.println("testclass2-test1");
	}
	
	@Test(groups = "smoke")
	public void test2() {
		System.out.println("testclass3-smoke2");
	}
	
	@Test(groups = "Regression")
	public void test3() {
		System.out.println("testclass4-test3");
	}
	
}
