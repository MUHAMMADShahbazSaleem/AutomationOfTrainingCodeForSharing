package PeopleNTech.Automationtraining;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Utility;
import PageObjectModel.Home;
import PageObjectModel.SignInPage;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SignInAmazon extends Utility {
  
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
	public void VerificationOfText() throws InterruptedException, IOException {
		Home ob=new Home(driver);
		Thread.sleep(6000);
		ob.SignToClick();
		shots();
		SignInPage it=new SignInPage(driver);
		Thread.sleep(6000);
		it.EmailFieldSendKeys();
		shots();
		Thread.sleep(6000);
		it.ContinueButtonClick();
		shots();
	String errorit=	it.text();
	System.out.println(errorit);
	SoftAssert soft=new SoftAssert();
	
	soft.assertEquals(errorit, "We cannot find an account with that email address");
	System.out.println("This is after assertion");
	soft.assertAll();
	}
  
}
