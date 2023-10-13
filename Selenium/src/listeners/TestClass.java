package listeners;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.ListeneresImplimentation.class)
public class TestClass extends BaseClass {

	@Test
	public void tc1() {
		Reporter.log("Hello World",true);
	}
}
