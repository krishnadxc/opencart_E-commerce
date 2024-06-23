package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txt_firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txt_lastname;
	
	@FindBy(xpath="//input[@id='input-email']") WebElement txt_email;
	
	@FindBy(xpath="//input[@id='input-telephone']") WebElement txt_phonenumber;   //1
	
	@FindBy(xpath="//input[@id='input-password']") WebElement txt_password;
	
	@FindBy(xpath="//input[@id='input-confirm']") WebElement txt_confirmpassword;   //2
	
	@FindBy(xpath="//input[@value='0']") WebElement radio_btn_no;

	@FindBy(xpath="//input[@name='agree']") WebElement checkbox_agree;
	
	@FindBy(xpath="//input[@value='Continue']") WebElement click_continue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement confirmationmsg;
	
	
	
	//actions methods
	public void setfirstname(String firstname)
	{
		txt_firstname.sendKeys(firstname);
	}
	
	
	public void setlastname(String lastname)
	{
		txt_lastname.sendKeys(lastname);
	}
	
	
	public void setemail(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void setphno(String phno)
	{
		txt_phonenumber.sendKeys(phno);
	}
	
	
	public void setpassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void setconfpassword(String confpassword)
	{
		txt_confirmpassword.sendKeys(confpassword);
	}
	
	
	public void clickno()
	{
		radio_btn_no.click();
	}
	
	
	public void clickcheckbox()
	{
		checkbox_agree.click();
	}
	
	
	public void clickcontinue()
	{
		click_continue.click();
		
		//solution-1
		//click_continue.submit();
		
		
		//Solution-2
		//Actions act=new Actions(driver);
		//act.moveToElement(click_continue).click().perform();
		
		
		//Solution-3
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", click_continue);
		
		//Solution-4
		//click_continue.sendKeys(Keys.RETURN);
		
		//Solution-5
		//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(click_continue)).click();
		
		
		}
	
	public String getconfirmationmsg()
	{
		try
		{
			return (confirmationmsg.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
		
	}
}
