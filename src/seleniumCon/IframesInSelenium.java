package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesInSelenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//There are three overloaded methods in frames
		// String Argument
		//driver.switchTo().frame("frame-bottom");
		
		//WebElement argument
		/*
		 * WebElement
		 * bottomFrmae=driver.findElement(By.xpath("//frame[@src='/frame_bottom']"));
		 * driver.switchTo().frame(bottomFrmae);
		 * System.out.println("Bottom frame text: "+driver.findElement(By.xpath("//body"
		 * )).getText());
		 */
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		System.out.println("Left frame text: "+driver.findElement(By.xpath("//body")).getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		System.out.println("Middle frame text: "+driver.findElement(By.xpath("//body")).getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame-middle");
		 System.out.println("Bottom frame text: "+driver.findElement(By.xpath("//body"
		 )).getText());
	
	}

}
