package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardanMouseActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebElement user1=driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
		//WebElement user2=driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
		Actions act=new Actions(driver);
		// Mouse Over
		/*
		 * act.moveToElement(user1).perform(); Thread.sleep(5000);
		 * act.moveToElement(user2).perform();
		 */
		
		// Right Click
		/*
		 * WebElement contextMenu=driver.findElement(By.id("hot-spot"));
		 * act.moveToElement(contextMenu).contextClick().perform();
		 */
		// Double click as assignment 
		
		// To press keys from key board
		
		act.sendKeys(Keys.ALT).perform();
		Thread.sleep(5000);
		act.sendKeys("T").perform();
		
		act.sendKeys(Keys.CONTROL).build();
		act.sendKeys(Keys.ALT).build();
		act.sendKeys(Keys.DELETE).perform();
		act.release();
	}

}
