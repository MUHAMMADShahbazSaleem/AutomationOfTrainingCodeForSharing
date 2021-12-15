package PeopleNTech.Automationtraining;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.Home;
import PageObjectModel.SignInPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SignInAmazon {
  public WebDriver driver;
	@Test(priority = 2,dependsOnMethods ="VerificationOfText" )
    public void f() throws InterruptedException {
		Home ob=new Home(driver);
		Thread.sleep(6000);
		ob.SignToClick();
		SignInPage it=new SignInPage(driver);
		Thread.sleep(6000);
		it.EmailFieldSendKeys();
		Thread.sleep(6000);
		it.ContinueButtonClick();
  }
	@Test(priority = 1)
	public void VerificationOfText() throws InterruptedException {
		Home ob=new Home(driver);
		Thread.sleep(6000);
		ob.SignToClick();
		SignInPage it=new SignInPage(driver);
		Thread.sleep(6000);
		it.EmailFieldSendKeys();
		Thread.sleep(6000);
		it.ContinueButtonClick();
	String errorit=	it.text();
	System.out.println(errorit);
	SoftAssert soft=new SoftAssert();
	
	soft.assertEquals(errorit, "We cannot find an account with that email address true");
	System.out.println("This is after assertion");
	soft.assertAll();
	}
  @BeforeMethod
  public void beforeMethod() {
	 // 
      
      driver.navigate().to("https://www.amazon.com");
      driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.quit();
  }
  public void browsers(String browser) {
	  if(browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\IGU Staff\\git\\AutomationOfTrainingCodeForSharing\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		     driver=new ChromeDriver();
	  }else if(browser.equalsIgnoreCase("Ëdge")) {
		  System.setProperty("webdriver.edge.driver","C:\\Users\\IGU Staff\\git\\AutomationOfTrainingCodeForSharing\\Automationtraining\\src\\Drivers\\msedgedriver.exe" );
	      driver=new EdgeDriver();
		  
	  }else {
		  System.out.println("Correct browser name");
	  }
	  
  }

}
