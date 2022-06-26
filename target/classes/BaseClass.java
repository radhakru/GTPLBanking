package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	public WebDriver driver;
	public Properties propti;

	public WebDriver CommonBrowser() throws IOException {
		propti = new Properties();
		FileInputStream fileread = new FileInputStream(
				"C:\\Users\\gulu satapathy\\java-selenium\\E2EProject\\src\\test\\java\\Resources\\External.properties");
		propti.load(fileread);
		String SelectBrowsername = propti.getProperty("Browser");
		//String SelectBrowsername=System.getProperty("Browser");

		if (SelectBrowsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (SelectBrowsername.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (SelectBrowsername.equalsIgnoreCase("IE")) {
			System.setProperty("Webdriver.IE.Driver", System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public String getScreenshort(String failtestcase,WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		String Des=System.getProperty("user.dir")+"\\Screenshot\\"+failtestcase+".png";
		FileUtils.copyFile(Source, new File(Des));
		return Des;
		
	}
	
	
}
