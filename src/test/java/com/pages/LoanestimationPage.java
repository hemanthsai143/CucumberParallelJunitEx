package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanestimationPage {
	
	public WebDriver driver;
	

	public LoanestimationPage(WebDriver driver){
		this.driver=driver;
        PageFactory.initElements(driver, this);		
		}
	
	
	@FindBy(xpath="//input[@id='application_type_single']")
	WebElement applicationtypesingle;
	
	
    public void singleapplicationtype(String applicationtype)
	{
		if(applicationtype.contains("Single"))
		{
		applicationtypesingle.click();
		}
	}



}
