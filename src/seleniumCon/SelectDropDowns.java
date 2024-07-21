package seleniumCon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://www.krninformatix.com/sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// select options methods 1. selectByVisibleText 2. SelectByValue 3.SelectByIndex
		// selection option from single dropdown
		/*
		 * WebElement singleSelectDropDown=driver.findElement(By.id("city")); Select
		 * sel=new Select(singleSelectDropDown); Thread.sleep(5000);
		 * sel.selectByVisibleText("Bangalore"); Thread.sleep(5000);
		 * sel.selectByValue("2"); Thread.sleep(5000); sel.selectByIndex(3);
		 * Thread.sleep(5000);
		 */
		
		
		WebElement multiSelectDropDown=driver.findElement(By.id("cities"));
		Select multisel=new Select(multiSelectDropDown);
		Thread.sleep(5000);
		multisel.selectByVisibleText("Mumbai");
		Thread.sleep(5000);
		multisel.selectByValue("1");
		Thread.sleep(5000);
		multisel.selectByIndex(3);
		Thread.sleep(5000);
		
		// how to get all options from dropdown
		ArrayList arr=new ArrayList();
		List<WebElement> alloptions=multisel.getAllSelectedOptions();
		for(WebElement option:alloptions) {
			String opt= option.getText();
			arr.add(opt);
		}
		System.out.println(arr);
		//multisel.getAllSelectedOptions();// Try as a assignment.
		multisel.deselectAll(); //and delect methods //Try as a assignment. 
		driver.close();
		
	}

}
