package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOOLTIPPopups {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String tooltip=driver.findElement(By.xpath("//img[contains(@src,'samsung-galaxy-watch-')]")).getAttribute("title");
		
		System.out.println("Tool Tip Text: "+tooltip);
	}

}
