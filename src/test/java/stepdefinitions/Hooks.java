package stepdefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	
	public TestContext testcontext;
	public WebDriver driver;
	
	public Hooks(TestContext context)
	{
		this.testcontext=context;
		
	}
	
	
	@Before
	public void setUp() throws IOException {
        
       Properties prop=new Properties();
		String path=System.getProperty("user.dir");
		
		try {
			FileInputStream fis = new FileInputStream(path+"\\data.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browserName=System.getProperty("browser"); //To pass the browser name from maven command
		//String browserName=prop.getProperty("browser");
		System.out.println("browserName"+browserName);
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",prop.getProperty("chromedriverPath"));
			ChromeOptions ch=new ChromeOptions();
			ch.setHeadless(false);
			driver = new ChromeDriver(ch);
			System.out.println("Driver initalized");
	        testcontext.setDriver(driver);
      }
		
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver",prop.getProperty("IEdriverPath"));
			
			driver = new InternetExplorerDriver();
			System.out.println("Driver initalized");
	        testcontext.setDriver(driver);
      }

		
    }
	
	@After
	public void takeScreenshot(Scenario sc)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
		sc.attach(screenshot, "image/png", "screenshotattached");
		driver.close();
		
		

		}

}
