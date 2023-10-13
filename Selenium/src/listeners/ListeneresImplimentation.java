package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListeneresImplimentation implements ITestListener {

	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
        System.out.println("Success");	
   }

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finish");
	}

	
}
