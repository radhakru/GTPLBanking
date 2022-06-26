package Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resources.BaseClass;

public class Listener extends BaseClass implements ITestListener {

	ExtentTest caseonTest;
	ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();
	ExtentReports extent = ExtendReport.getExtendRepports();

	@Override
	public void onTestStart(ITestResult result) {

		caseonTest = extent.createTest(result.getMethod().getMethodName());
		extenttest.set(caseonTest);
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		extenttest.get().log(Status.PASS, "Testcase pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		extenttest.get().fail(result.getThrowable());

		WebDriver driver = null;
		String failmethodname = result.getMethod().getMethodName();
	
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e1) {

			e1.printStackTrace();
		}

		try {
			extenttest.get().addScreenCaptureFromPath(getScreenshort(failmethodname, driver),failmethodname);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

		extent.flush();
	}

}
