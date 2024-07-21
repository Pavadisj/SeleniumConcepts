package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://stackoverflow.com/questions/53690979/how-can-we-run-cucumber-tests-via-a-batch-file");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Scroll By x-axis and y-axis
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,2000)", "");
		
		// Scroll until WebElement 
		WebElement postWe=driver.findElement(By.id("submit-button"));
		Thread.sleep(5000);
		jse.executeScript("arguments[0].scrollIntoView(true);",postWe );
		
		WebElement answerText=driver.findElement(By.xpath("//span[@itemprop='answerCount']/parent::h2"));
		Thread.sleep(5000);
		jse.executeScript("arguments[0].scrollIntoView(true);",answerText );
		
		
		
		
	}

}
