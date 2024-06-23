package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	WebDriver driver;
	//constructor
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement Myaccountlink;
	
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement Registerlink;
	
	@FindBy(xpath="//a[normalize-space()='Login']") WebElement Loginlink;
	
	
	public void clickmyaccount()
	{
		Myaccountlink.click();
	}
	
	public void clickregister()
	{
		Registerlink.click();
	}
	
	public void cliklogin()
	{
		Loginlink.click();
	}
	
}
