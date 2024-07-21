package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAVASCRIPTALERT {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// JS ALERT
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert jsA=driver.switchTo().alert();
		Thread.sleep(5000);
		//jsA.accept();
		jsA.dismiss();
		
		// JS Confirmation
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert jsC=driver.switchTo().alert();
		Thread.sleep(5000);
		//jsA.accept();
		jsC.dismiss();
		
		// JS Prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		System.out.println("Text of Prompt :"+driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("AAAAAAAAAA");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
		
		
		
	}

}
