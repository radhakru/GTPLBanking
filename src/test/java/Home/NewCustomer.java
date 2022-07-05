package Home;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.NewCustomerPage;
import Resources.BaseClass;

public class NewCustomer extends BaseClass
{
	public WebDriver driver;
	public static Logger logger=LogManager.getLogger(BaseClass.class.getName());	
	@BeforeTest
	public void start() throws IOException {
		driver=CommonBrowser();
	}
	
	
	
	
	@Test
	
	public void invalidusername() {
	 NewCustomerPage newcustomerpage=new NewCustomerPage(driver);
	 newcustomerpage.url().get(propti.getProperty("NewUrl"));
	 logger.info("Load Url successfuly");
	 newcustomerpage.setusername().sendKeys(propti.getProperty("name"));
	 logger.info("Type the username sucessfully.");
	}
	
	
	
}
