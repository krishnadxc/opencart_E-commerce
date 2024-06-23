package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass
{
	
	@Test(groups= {"Sanity","Master"})
	public void verify_account_registration() throws InterruptedException
	{
		try
		{
		logger.info("**Starting TC001_AccountRegistrationTest**");
		HomePage hp=new HomePage(driver);
		
		hp.clickmyaccount();
		logger.info("clicked on my account link");
		
		hp.clickregister();
		logger.info("clicked on my register link");
		
		
		AccountRegistrationPage regacct=new AccountRegistrationPage(driver);
		
		logger.info("providing customer details");
		regacct.setfirstname(randomeString().toUpperCase());
		
		regacct.setlastname(randomeString().toUpperCase());
		regacct.setemail(randomeString()+"@gmail.com");
		regacct.setphno(randomeNumber());
		
		String password=randomAlphaNumeric();
		regacct.setpassword(password);
		regacct.setconfpassword(password);
		
		//regacct.clickno();
		regacct.clickcheckbox();
		regacct.clickcontinue();
		
		logger.info("validating expected message");
		String msg=regacct.getconfirmationmsg();
		if(msg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test failed");
			logger.debug("Debug logs");
			Assert.assertTrue(false);
		}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("**completed TC001_AccountRegistrationTest**");
		
	}
	
	
	
}
