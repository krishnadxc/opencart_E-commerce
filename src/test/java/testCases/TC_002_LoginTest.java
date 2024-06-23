package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass 
{
	

	@Test(groups= {"Regression", "Master"})
	public void verify_login()
	{
		try
		{
		logger.info("*** Starting TC_002_LoginTest ***");
		
		//Homepage
		
		HomePage hp=new HomePage(driver);
		
		logger.info("cliking on my account");
		hp.clickmyaccount();
		
		hp.cliklogin();
		
		//Loginpage
		
		LoginPage lp=new LoginPage(driver);
		lp.setemailaddrs(p.getProperty("email"));
		lp.setpasswordd(p.getProperty("password"));
		lp.clicklogin();
		
		//Myaccountpage
		
		MyAccountPage myacc=new MyAccountPage(driver);
		boolean targetpage=myacc.ismyaccountexists();
		
		//Assert.assertEquals(targetpage, true, "Login failed");
		Assert.assertTrue(targetpage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("*** Finished TC_002_LoginTest completed ***");
		
	}
		
}
