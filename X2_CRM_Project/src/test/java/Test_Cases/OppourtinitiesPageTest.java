package Test_Cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.Baseclass;
import X2_CRM_Pages.Dashboardpage;
import X2_CRM_Pages.OppourtinitiesPage;
import X2_CRM_Pages.X2LoginPage;

public class OppourtinitiesPageTest extends Baseclass{
	
	X2LoginPage loginPage;
	Dashboardpage dashboardPage;
	OppourtinitiesPage oppPage;
	
	public OppourtinitiesPageTest()
	{
		super();
	}

	@BeforeMethod
	public void HitBrowser() throws Throwable
	{
		launchBrowser();
		loginPage = new X2LoginPage();
		dashboardPage = new Dashboardpage();
		oppPage = new OppourtinitiesPage();
		loginPage.logindata(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@Test
	public void FillDetails() throws Throwable
	{
		dashboardPage.clickOnOpp();
		oppPage.clickOnCreateOpp();
		oppPage.fillForm();
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
