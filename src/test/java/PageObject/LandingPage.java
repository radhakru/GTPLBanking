package PageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.BaseClass;

public class LandingPage {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	public WebDriver driver;

	By inputbox = By.xpath("//input[@name='uid']");
	By password = By.xpath("//input[@name='password']");
	By loginbutton=By.xpath("//input[@type='submit']");
	By Resetbutton=By.xpath("//input[@type='reset']");
	
	public LandingPage(WebDriver driver2) {
		this.driver = driver2;
		log.info("select driver");
		// TODO Auto-generated constructor stub
	}

	public WebElement getuserbox() {
		return driver.findElement(inputbox);
	}

	public WebElement getpassword() {
		return driver.findElement(password);
	}
	public void clickonloginbutton() {
		driver.findElement(loginbutton).click();
		
	}
	public void clickonresetbutton() {
		driver.findElement(Resetbutton).click();
		
	}
	

}
