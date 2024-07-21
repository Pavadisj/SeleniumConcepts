package seleniumCon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMultipleElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> links=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int numberOfLinks=links.size();
		System.out.println("Number of links: "+numberOfLinks);
		
		for(WebElement link:links) {
			link.click();
			}
			
			
			
		}
		
		
		
	}


