package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Baseclass;
import X2_CRM_Pages.Dashboardpage;
import X2_CRM_Pages.X2LoginPage;

public class X2LoginPageTest extends Baseclass{
	
	X2LoginPage loginpage ;
	Dashboardpage dashboard;
	
	public X2LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void hitBrowser()
	{
		launchBrowser();
		loginpage = new X2LoginPage();
		dashboard = new Dashboardpage();
	}
	
	@Test
	public void login() throws Throwable
	{
		dashboard = loginpage.logindata(prop.getProperty("email"), prop.getProperty("password"));
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "CRM Tech - View Profile");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
