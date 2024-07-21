package seleniumCon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		Thread.sleep(3000);
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		
		List<WebElement> productTypeDropDown=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		
		for(WebElement options:productTypeDropDown) {
			if(options.getText().equals("Accounts")) {
				options.click();
				break;
			}
			
		}
		
		
	}

}
