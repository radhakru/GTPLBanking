package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class NewCustomerPage  {
	public WebDriver driver;
	
	
	
	@FindBy(xpath="//input[@name='name']")
	WebElement Usernamebox;
	@FindBy(xpath="(//*[@type='radio'])[1]")
	WebElement Maleradiobutton;
	@FindBy(xpath="(//*[@type='radio'])[2]")
	WebElement Femaleradiobutton;
	@FindBy(id="dob")
	WebElement Dateofbirth;
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement Address;
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	@FindBy(xpath="//input[@name='state']")
	WebElement State;
	@FindBy(xpath="//input[@name='pinno']")
	WebElement Pincode;
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement Telephonenumber;
	@FindBy(xpath="//input[@name='emailid']")
	WebElement Emailid;
	@FindBy(xpath="//input[@name='sub']")
	WebElement Submit;
	@FindBy(xpath="//input[@name='res']")
	WebElement Reset;
	
	
	
	public NewCustomerPage(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public WebElement setusername() {
		return  Usernamebox;
	}
	public WebElement clickonRadiobutton() {
		return Maleradiobutton;
	}
	public WebElement setdateofbirth() {
		return Dateofbirth;
	}
	public WebElement setAddress() {
		return Address;
	}
	public WebElement setcity() {
		return City;
	}
	public WebElement setstate() {
		return State;
	}
	public WebElement setpincode() {
		return Pincode;
	}
	public WebElement settelephonenumber() {
		return	Telephonenumber;
	}
	public WebElement setEmailid() {
		return Emailid;
	}
	public WebElement clicksubmitbutton() {
		return Submit;
	}
	public WebElement clickresetbutton() {
		return Reset;
	}
	public WebDriver url() {
		
		return driver;
	}
	
	
	
	
	
	
	
	
	
}
