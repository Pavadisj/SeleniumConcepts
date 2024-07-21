package seleniumCon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://www.krninformatix.com/sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Select DropDowns
		WebElement singleSelect=driver.findElement(By.id("city"));
		Select sel=new Select(singleSelect);
		// to select we have three methods 
		// SelectByIndex   selectByValue selectByVisibleText
		sel.selectByIndex(0);
		Thread.sleep(3000);
		sel.selectByValue("2");
		Thread.sleep(3000);
		sel.selectByVisibleText("Mumbai");
		Thread.sleep(3000);
		
		List<WebElement> allOptions=sel.getOptions();
		// 0 1 2 3
		int size=allOptions.size(); //4 
		
		for(int i=0; i<size; i++) {
			String allOptionsText=allOptions.get(i).getText();
			System.out.println(allOptionsText);
		}
		// How to select selected options 
		WebElement multiSelect=driver.findElement(By.id("cities"));
		Select se=new Select(multiSelect);
		se.selectByIndex(0);
		Thread.sleep(3000);
		se.selectByValue("2");
		Thread.sleep(3000);
		se.selectByVisibleText("Delhi");
		Thread.sleep(3000);
		List<WebElement> allSelOptions=se.getAllSelectedOptions();
		// 0 1 2 3
		int size1=allSelOptions.size(); //4 
		
		for(int i=0; i<size1; i++) {
			String allSelectedOptionsText=allSelOptions.get(i).getText();
			System.out.println("Selected Options: "+allSelectedOptionsText);
		}
		
		se.deselectByVisibleText("Delhi");
		Thread.sleep(3000);
		se.deselectAll();
		Thread.sleep(3000);
		
		driver.close();
	}

}
