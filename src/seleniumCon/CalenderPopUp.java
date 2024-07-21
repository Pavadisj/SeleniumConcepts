package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://www.vrlbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.sendKeys(Keys.ESCAPE).perform();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//input[@id='txtFromDate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='11']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
