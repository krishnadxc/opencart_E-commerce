package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']") WebElement txt_emailaddress;
	
	@FindBy(xpath="//input[@id='input-password']") WebElement txt_passwordbox;
	
	@FindBy(xpath="//input[@value='Login']") WebElement btn_login;
	
	public void setemailaddrs(String emailaddrs)
	{
		txt_emailaddress.sendKeys(emailaddrs);
	}
	
	public void setpasswordd(String passwords)
	{
		txt_passwordbox.sendKeys(passwords);
	}
	
	public void clicklogin()
	{
		btn_login.click();
	}
	
}
