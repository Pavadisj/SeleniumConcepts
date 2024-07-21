package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String toolTip=driver.findElement(By.xpath("//img[contains(@src,'samsung-galaxy-s24-ultra-')]")).getAttribute("title");
		System.out.println("toooTip: "+toolTip);
		
		System.out.println("src attribute value: "+driver.findElement(By.xpath("//img[contains(@src,'samsung-galaxy-s24-ultra-')]")).getAttribute("src"));
	    
	}

}
