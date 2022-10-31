package X2_CRM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;

public class OppourtinitiesPage extends Baseclass {
	
	@FindBy(linkText = "Create Opportunity")
	WebElement createOppurtinity;

	@FindBy(xpath = "//input[@id='Opportunity_name']")
	WebElement Name;
	
	@FindBy(xpath = "//input[@name='Opportunity[email]']")
	WebElement e_mail;
	
	@FindBy(xpath = "//input[@id='Opportunity_quoteAmount']")
	WebElement QuoteAmt;
	
	@FindBy(xpath = "//input[@id='Opportunity_probability']")
	WebElement Probability;
	
	@FindBy(xpath = "//input[@id='save-button']")
	WebElement CreateBtn;
	
	public OppourtinitiesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fillForm()throws Throwable
	{
		Name.sendKeys("Suraj");
		e_mail.sendKeys("suraj001@gmail.com");
		QuoteAmt.sendKeys("10000");
		Probability.sendKeys("75");
		Thread.sleep(5000);
		CreateBtn.click();
	}
	public void clickOnCreateOpp()
	{
		createOppurtinity.click();
	}
}
