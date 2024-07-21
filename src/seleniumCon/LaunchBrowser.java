package seleniumCon;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Title
		/*
		 * String actualTitle=driver.getTitle(); String expectedTitle="OrangeHRM";
		 * Assert.assertEquals(actualTitle, expectedTitle,
		 * "Both Titles are not matched"); System.out.println("Passed");
		 * 
		 * //Url String expectedUrl=
		 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; String
		 * actaulUrl=driver.getCurrentUrl(); Assert.assertEquals(actaulUrl, expectedUrl,
		 * "Both URL are not matched");
		 * System.out.println("Both expected and actual URL are matched");
		 * 
		 * // Text WebElement
		 * loginEle=driver.findElement(By.xpath("//h5[text()='Login']")); String
		 * expectedText="Login"; String actualText=loginEle.getText();
		 * Assert.assertEquals(actualText, expectedText, "Both Text are not matched");
		 * System.out.println("Both expected and actual Text are matched");
		 * 
		 * 
		 * // logo WebElement
		 * logoImg=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		 * boolean logoImage=logoImg.isDisplayed(); Assert.assertTrue(true,
		 * "Logo not displayed"); System.out.println("Logo displayed");
		 */
		
		// is methods (isSelected is Displayed and is enable)
		
		//driver.findElement(By.id("male")).isSelected();
		
		//isSelected()
		//driver.findElement(By.id("male")).click();
		//System.out.println("MAle button: "+driver.findElement(By.id("male")).isSelected());
		
		//System.out.println("Female button: "+driver.findElement(By.id("female")).isSelected());
		// isEnabled();
		
		
		
		System.out.println(driver.findElement(By.xpath("//*[text()='Login']")).isEnabled());
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//*[text()='Login']")).isEnabled());
		driver.close();
		
		
		
		 
	}

}
