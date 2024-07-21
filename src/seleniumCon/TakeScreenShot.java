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

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://stackoverflow.com/questions/53690979/how-can-we-run-cucumber-tests-via-a-batch-file");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Full page screenShot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./ScreenShots/stackOverFlowPage.PNG");

		Files.copy(src, trg);

		// Full portion of the page

		WebElement partp = driver.findElement(By.xpath("//span[text()='\"starting script\"']/ancestor::pre"));
		File src1 = partp.getScreenshotAs(OutputType.FILE);
		File trg1 = new File("./ScreenShots/partportion.PNG");

		Files.copy(src1, trg1);
	}

}
