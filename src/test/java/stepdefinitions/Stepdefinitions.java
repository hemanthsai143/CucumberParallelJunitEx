package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.pages.LoanestimationPage;
import com.utils.Base;

import context.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class Stepdefinitions  {
	
	public WebDriver driver;
	public static  Properties p;
	LoanestimationPage loanestimationPage;
	
public TestContext testcontext;
	
	public Stepdefinitions(TestContext context)
	{
		this.testcontext=context;
		 driver = testcontext.getDriver();
	     loanestimationPage=new LoanestimationPage(driver);
	    

		
	}



	
	@Given("user launches the browser with base url.")
	public void user_launches_the_browser_with_base_url()  {
		 
		
	    
        driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
        driver.manage().window().maximize();

	}

	@When("user enters all the details for estimation.")
	public void user_enters_all_the_details_for_estimation(DataTable userDetails) {
//		loanestimationPage=new LoanestimationPage(driver);
		List<List<String>> data=userDetails.asLists();
		String applicationType=data.get(1).get(0);
		loanestimationPage.singleapplicationtype(applicationType);
		
//        String numberofdependants=data.get(1).get(1);
//        loanestimationPage.selectnumberofdependants(numberofdependants);
//        String propertytype=data.get(1).get(2);
//        loanestimationPage.selectpropertytype(propertytype);
//        String annualincome=data.get(1).get(3);
//        String otherincome=data.get(1).get(4);
//        loanestimationPage.enterearningdetails(annualincome, otherincome); 
//        String monthlylivingExpenses=data.get(1).get(5);
//        String homeloan=data.get(1).get(6);
//        String otherloan=data.get(1).get(7);
//        String monthlycommitments=data.get(1).get(8);
//        String totalcreditlimits=data.get(1).get(9);
//        loanestimationPage.enterexpensesDetails(monthlylivingExpenses, homeloan, otherloan, monthlycommitments, totalcreditlimits);

      

		 }
	

}
