package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.Baseclass;
import X2_CRM_Pages.Dashboardpage;
import X2_CRM_Pages.X2LoginPage;

public class DashboardPageTest extends Baseclass {

	X2LoginPage loginpage;
	Dashboardpage dashboardpage;
	
	public DashboardPageTest() {
		super();
	}
	
	@BeforeMethod
	public void HitBrowser() throws Throwable
	{
		launchBrowser();
		loginpage = new X2LoginPage();
		dashboardpage = new Dashboardpage();
		loginpage.logindata(prop.getProperty("email"), prop.getProperty("password"));
		
	}
	
	@Test(priority = 1)
	public void opp()throws Throwable
	{
		dashboardpage.clickOnOpp();
		Thread.sleep(3000);
		String oppPageTitle = driver.getTitle();
		Assert.assertEquals(oppPageTitle, "CRM Tech - Opportunities");
	}
	
	@Test
	public void LogoTesting()
	{
		boolean logo = dashboardpage.LogoTest();
		Assert.assertEquals(logo, true);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
