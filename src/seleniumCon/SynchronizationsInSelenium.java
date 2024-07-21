package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// implicit wait-- no such element exceptions 
		// explicit wait --- Element not visible exceptions
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement greenToasterMessage=driver.findElement(By.xpath("/html/div"));
		WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofSeconds(30));
		explicitWait.until(ExpectedConditions.visibilityOf(greenToasterMessage));
		
		// Fluent  
		
		Wait<WebDriver> fluent=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(20))
				.ignoring(NoSuchElementException.class);
				fluent.until(ExpectedConditions.visibilityOf(greenToasterMessage));
	}

}
