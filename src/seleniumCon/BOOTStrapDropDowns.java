package seleniumCon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BOOTStrapDropDowns {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://www.hdfcbank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		
		
		List<WebElement> productTypeDd=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		for(WebElement option:productTypeDd) {
			if(option.getText().equals("Credit Cards")) {
				option.click();
			}
		}
	
	}

}
