package test.ng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class WithknownFailed implements IRetryAnalyzer {
	int minCount=0, maxCount=5;
	public boolean retry(ITestResult Result) {
		
		if (minCount<maxCount) {
			minCount++;
			return true;
		}
		return false;
	}
	

}
