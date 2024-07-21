package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardandMouseAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		//Mouse mover 
		//WebElement user1=driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
		//act.moveToElement(user1).perform();
		//Thread.sleep(5000);
		//WebElement user2=driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
		//act.moveToElement(user2).perform();
		// right click
		
		/*
		 * WebElement hotbox=driver.findElement(By.id("hot-spot"));
		 * act.contextClick(hotbox).perform(); Thread.sleep(4000);
		 * 
		 * driver.switchTo().alert().accept(); // Double click
		 * act.doubleClick(hotbox).perform();
		 */
		// drag and drop actions
		/*
		 * WebElement sourceEle=driver.findElement(By.id("column-a")); WebElement
		 * targetEle=driver.findElement(By.id("column-b")); act.dragAndDrop(sourceEle,
		 * targetEle).perform();
		 * 
		 * act.dragAndDropBy(sourceEle, 100, 220);
		 */
		
		// Keyboard actions
		
		act.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);
		act.sendKeys("R").perform();
		act.sendKeys(Keys.CONTROL).build();
		act.sendKeys(Keys.ALT).build(); // store a action
		act.sendKeys(Keys.DELETE).perform(); // perform the action
	}

}
