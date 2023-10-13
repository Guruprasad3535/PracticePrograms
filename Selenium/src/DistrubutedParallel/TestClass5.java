package DistrubutedParallel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass5 {

	@Test
	public void test1() {
		Reporter.log("demo1",true);
	}
	
	@Test
	public void test2() {
		Reporter.log("demo2",true);
	}
}
