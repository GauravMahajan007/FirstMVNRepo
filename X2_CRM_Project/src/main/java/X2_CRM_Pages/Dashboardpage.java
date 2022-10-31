package X2_CRM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;
//https://eximsoftwares.com/Projects/CRM/index.php/profile/1
public class Dashboardpage extends Baseclass {
	
	@FindBy(linkText = "Opportunities")
	WebElement Oppourtinities;
	
	@FindBy(xpath = "//span[@id='your-logo']")
	WebElement logo;
	
	
	public Dashboardpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public OppourtinitiesPage clickOnOpp()
	{
		Oppourtinities.click();
		return new OppourtinitiesPage();
	}
	
	public boolean LogoTest()
	{
		return logo.isDisplayed(); 
	}
	
	
}
