package crossBrowser;

import org.testng.annotations.Test;

public class TestClass1 extends BaseClass {

	@Test
	public void google() {
		driver.get("https://google.com/");
	}
}
