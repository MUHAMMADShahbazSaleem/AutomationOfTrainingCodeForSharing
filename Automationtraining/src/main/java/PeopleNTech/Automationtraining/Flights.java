package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IGU Staff\\git\\AutomationOfTrainingCodeForSharing\\Automationtraining\\src\\Drivers\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.navigate().to("https://www.expedia.com/");
	      driver.manage().window().maximize();
	      WebElement flights=driver.findElement(By.xpath("//*[text()='Flights']"));
	      flights.click();
	      WebElement departure=driver.findElement(By.id("d1-btn"));
	      departure.click();
	      Thread.sleep(6000);
	      WebElement slectdatefor=driver.findElement(By.xpath("//*[@aria-label='Dec 26, 2021']"));
	      slectdatefor.click();
	}

}
