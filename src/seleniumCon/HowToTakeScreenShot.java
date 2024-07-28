package seleniumCon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HowToTakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Takes screenShot
		Thread.sleep(5000);
		/*
		 * TakesScreenshot ts=(TakesScreenshot)driver; File
		 * scr=ts.getScreenshotAs(OutputType.FILE); File trg=new
		 * File("./ScreenShots/OrangeHrmLoginPage.PNG"); Files.copy(scr, trg);
		 */
		
		WebElement orangelogo=driver.findElement(By.xpath("(//img[@src='/web/images/ohrm_logo.png'])[2]"));
		File scr1=orangelogo.getScreenshotAs(OutputType.FILE);
		File trg1=new File("./ScreenShots/orangelogo.PNG");
		Files.copy(scr1, trg1);
		driver.close();
		
		
		
	}

}
