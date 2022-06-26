package Home;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.BaseClass;

public class TestCase extends BaseClass {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	public LandingPage lp;
	String ExceptedAlert="User is not valid";
	String ExceptedTitle="GTPL Bank Manager HomePage";
	@BeforeTest
	public void start() throws IOException {
		driver = CommonBrowser();
		
	}
	

	@Test
	// (dataProvider = "getdata")
	// (String searchname, String text) throws IOException
	public void invalidusername()   {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(propti.getProperty("NewUrl"));
		log.info("land on webpage");
		lp = new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.getuserbox().sendKeys(propti.getProperty("username"));
		log.info("Enter invalid username in uesr box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.clickonloginbutton();
		log.info("click on login button");
		Assert.assertEquals(driver.switchTo().alert().getText(), ExceptedAlert);
		log.info("assert condition");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().alert().accept();
		log.info("Accept alert");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.navigate().back();
		log.info("back to the home page for Screenshot");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Assert.assertEquals(driver.getTitle(), ExceptedTitle);
		
	}

	@Test
	public void invalidpassword() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(propti.getProperty("NewUrl"));
		log.info("Land on the Webpage");
		lp = new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.getpassword().sendKeys(propti.getProperty("password"));
		log.info("Enter password");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.clickonloginbutton();
		log.info("User click on login button");
		Assert.assertEquals(driver.switchTo().alert().getText(), ExceptedAlert);
		log.info("assert condition");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().alert().accept();
		log.info("Accept alert");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("navigate to home page for screenshot");
		Assert.assertEquals(driver.getTitle(), ExceptedTitle);

	}
	@Test
	public void invalidusernameandpassword() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(propti.getProperty("NewUrl"));
		log.info("Land on the WebPage");
		lp=new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.getuserbox().sendKeys(propti.getProperty("inusername"));
		log.info("Enter username");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.getpassword().sendKeys(propti.getProperty("inpassword"));
		log.info("Enter password");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.clickonloginbutton();
		log.info("user click on login button");
		Assert.assertEquals(driver.switchTo().alert().getText(),ExceptedAlert);
		log.info("Assert condition is True");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().alert().accept();
		log.info("Accept alert");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().back();
		log.info("Back to the home page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		log.info("Wait 50 sec");
		Assert.assertEquals(driver.getTitle(), ExceptedTitle);
		
		
	}
	@Test
	public void validusername() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get(propti.getProperty("NewUrl"));
		log.info("Land on the Webpage");
		lp=new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.getuserbox().sendKeys(propti.getProperty("Username"));
		log.info("Enter valid username");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.clickonloginbutton();
		log.info("click on login button");
		Assert.assertEquals(driver.switchTo().alert().getText(), ExceptedAlert);
		log.info("Assert condition is True");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().alert().accept();
		log.info("Accept Alert");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().back();
		log.info("Back to the home page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		log.info("Wait 30 sec");
		Assert.assertEquals(driver.getTitle(), ExceptedTitle);
		
		
	}
	@Test
	public void validpassword() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(propti.getProperty("NewUrl"));
		log.info("Land on the Webpage");
		lp=new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.getpassword().sendKeys(propti.getProperty("Password"));
		log.info("Enter the valid password");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp.clickonloginbutton();
		log.info("click on login button");
		Assert.assertEquals(driver.switchTo().alert().getText(), ExceptedAlert);
		log.info("Assert condition is True");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().alert().accept();
		log.info("Accept Alert");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().back();
		log.info("Back to the Home page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		log.info("Wait 10 seconds after close the webpage");
		Assert.assertEquals(driver.getTitle(),ExceptedTitle);
		
		
	}
	@Test
	public void userboxfieldwithonlynumerials() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(propti.getProperty("NewUrl"));
		log.info("Land on the Webpage");
		lp=new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("Wait 10 seconds after that enter key in userbox");
		lp.getuserbox().sendKeys(propti.getProperty("userid"));
		log.info("Enetr numerials in userbox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("wait 10 seconds after that clik on login button");
		lp.clickonloginbutton();
		log.info("Click on login button");
		Assert.assertEquals(driver.switchTo().alert().getText(), ExceptedAlert);
		log.info("Alert condition is True");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("Wait 10 seconds after that Accept alert");
		driver.switchTo().alert().accept();
		log.info("Accept alert");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		log.info("Wait 20 seconds After that navigate to homepage");
		driver.navigate().back();
		log.info("Back to the home page for Screenshot");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		log.info("Wait 20 seconds after close the browser");
		Assert.assertEquals(driver.getTitle(), ExceptedTitle);
		
		
	}
	
	
	
	
	
	

	
	 /* @DataProvider 
	  public Object[][] getdata()
	   { 
	  Object[][] n = new Object[2][2];
	  n[0][0] = "nike.com"; 
	  n[0][1] = "Hello";
	  n[1][0] = "Gulu";
	  n[1][1]="Hello Gulu";
	  
	  return n;

	  }
	 */

	@AfterTest
	public void teardown() {
		driver.close();
		
	}

}
