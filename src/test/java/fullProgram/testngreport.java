package fullProgram;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class testngreport {
	@BeforeTest
	public static ExtentReports getReportObject() {
		String path = System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("web automation result");
		reporter.config().setDocumentTitle("test result");
		ExtentReports extent  = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "rahulshetty");
		return extent;
		
	}
}
