package PeopleNTech.Automationtraining;

import org.testng.annotations.Test;

import PageObjectModel.Home;
import PageObjectModel.SignInPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignInAmazon {
  public WebDriver driver;
	@Test
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
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\IGU Staff\\git\\AutomationOfTrainingCodeForSharing\\Automationtraining\\src\\Drivers\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.navigate().to("https://www.amazon.com");
      driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
