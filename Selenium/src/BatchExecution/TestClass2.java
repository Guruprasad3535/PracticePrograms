package BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {

	@Test
	public void test1() {
		Reporter.log("Testclass2-test1",true);
	}
	
	@Test
	public void test2() {
		Reporter.log("Testclass2-test2",true);
	}
}
