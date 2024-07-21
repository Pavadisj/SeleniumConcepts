package seleniumCon;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) {
		
		//Implicitly wait
		// Explicit wait ...
		// Fluent Wait ... 
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement logoImg=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		WebDriverWait expliciWait=new WebDriverWait(driver, Duration.ofSeconds(60));
		expliciWait.until(ExpectedConditions.visibilityOf(logoImg));
		
		// Fluent Wait ...
		Wait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
				fluentWait.until(ExpectedConditions.visibilityOf(logoImg));
	
	}

}
