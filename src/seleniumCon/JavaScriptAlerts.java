package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
		// Alert -- comes with one button (OK)
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert jsAlert=driver.switchTo().alert();
		Thread.sleep(3000);
		jsAlert.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		jsAlert.dismiss();
		// Confirmation Alert -- comes with Two button (OK and Cancel)
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert jsConfirm=driver.switchTo().alert();
		Thread.sleep(3000);
		jsConfirm.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		jsConfirm.dismiss();
		// Propmpt Alert -- comes with Two button (OK and Cancel)along with Text Box
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert jsPrompt=driver.switchTo().alert();
		Thread.sleep(3000);
		jsPrompt.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		jsPrompt.dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		jsPrompt.sendKeys("I read and Understood");
		Thread.sleep(3000);
		jsPrompt.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		String textOfPrompt=jsPrompt.getText();
		System.out.println("text of Prompt :"+textOfPrompt);
	}

}
