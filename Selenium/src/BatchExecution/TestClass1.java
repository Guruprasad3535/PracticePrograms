package BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test
	public void demo1() {
		Reporter.log("Testclass1-demo1",true);
	}
	
	@Test
	public void demo2() {
		Reporter.log("Testclass1-demo2",true);
	}
	
	

}
