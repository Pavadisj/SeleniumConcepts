package seleniumCon;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabOrNewTabPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> allwinIds=driver.getWindowHandles();
		
		Iterator<String> winIds=allwinIds.iterator();
		String pareantId=winIds.next();
		String childId=winIds.next();
		driver.switchTo().window(childId);
		System.out.println("textFrom child window:"+driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		Thread.sleep(5000);
		driver.switchTo().window(pareantId);
	}

}
