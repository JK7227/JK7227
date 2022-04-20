package test.ng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FailedScreenshot implements ITestListener {

	
	public void onStart(ITestContext arg0) {
	
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("----Test Fail----");
		
	}

	public void onTestSkipped(ITestResult arg0) {

	}

	public void onTestStart(ITestResult arg0) {
			
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("----Test Fail----");
		
	}

	public void onFinish(ITestContext context) {

		
	}

}
