package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://stackoverflow.com/questions/1032847/can-java-call-parent-overridden-method-in-other-objects-but-not-subtype");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// How to scroll page
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)","");
		Thread.sleep(4000);
		WebElement postAnser=driver.findElement(By.id("submit-button"));
		jse.executeScript("arguments[0].scrollIntoView(true);",postAnser);
	}

}
