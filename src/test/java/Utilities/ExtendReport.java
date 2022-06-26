package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport {
	static ExtentReports extent;
	static String Reportpath = System.getProperty("user.dir")+"\\Reports\\indexR.html";

	public static ExtentReports getExtendRepports() {
		ExtentSparkReporter spark = new ExtentSparkReporter(Reportpath);
		extent = new ExtentReports();
		extent.attachReporter(spark);
		return extent;

	}

}
