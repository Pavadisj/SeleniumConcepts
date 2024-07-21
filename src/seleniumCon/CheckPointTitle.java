package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckPointTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Title
		String expectedTitle="OrangeHRM";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Both title are matched");
		
		//Url
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String actualUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Both URL are matched");
		
		
		// Text 
		
		WebElement orangehrmText=driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.6.1']"));
		
		String expectedText="OrangeHRM OS 5.6.1";
		String actualText=orangehrmText.getText();
		System.out.println("Value from app"+actualText);
		Assert.assertEquals(expectedText, actualText);
		System.out.println("Both text are matched");
		
		
		//WebElement or Logo
		WebElement orangehrmLogo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		Thread.sleep(5000);
		boolean logoStatus=orangehrmLogo.isDisplayed();
		System.out.println("Boolean value  "+logoStatus);
		
		Assert.assertEquals(logoStatus,true);

		System.out.println("Logo displayed");
		driver.close();// active tab or active window
	}

}
