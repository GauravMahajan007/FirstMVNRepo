package X2_CRM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.Baseclass;

public class X2LoginPage extends Baseclass{
	
	@FindBy(id = "LoginForm_username")
	WebElement username;

	@FindBy(id = "LoginForm_password")
	WebElement password;
	
	@FindBy(id = "signin-button")
	WebElement SignInBtn;
	
	
	public X2LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Dashboardpage logindata(String uname, String pass) throws Throwable
	{
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		SignInBtn.click();
		Thread.sleep(3000);
		SignInBtn.click();
		
		return new Dashboardpage();
	}
}
