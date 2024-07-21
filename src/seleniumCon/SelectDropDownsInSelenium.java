package seleniumCon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		driver.get("https://www.krninformatix.com/sample");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebElement logoImg=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		WebElement singleSelect=driver.findElement(By.id("city"));
		
		Select sel=new Select(singleSelect);
		Thread.sleep(4000);
		sel.selectByIndex(0);
		Thread.sleep(4000);
		sel.selectByValue("2");
		Thread.sleep(4000);
		sel.selectByVisibleText("Mumbai");
		Thread.sleep(4000);
		ArrayList al=new ArrayList();
		List<WebElement> allOptions=sel.getOptions();
		int si=allOptions.size();
		
		for(WebElement option:allOptions) {
			String optionsText=option.getText();
			al.add(optionsText);
		}
		System.out.println(al);
		
		for(int i=0; i<si; i++) {
			String text=allOptions.get(i).getText();
			System.out.println(text);
		}
		
		WebElement multiSelect=driver.findElement(By.id("cities"));
		Select sel1=new Select(multiSelect);
		Thread.sleep(4000);
		sel1.selectByIndex(0);
		Thread.sleep(4000);
		sel1.selectByValue("2");
		Thread.sleep(4000);
		sel1.selectByVisibleText("Mumbai");
		Thread.sleep(4000);
		sel1.deselectByIndex(0);
		List<WebElement> allSelectedOptions=sel1.getAllSelectedOptions();
		for(WebElement option:allSelectedOptions) {
			option.click();
			String optionsText=option.getText();
			System.out.println(optionsText);
		}
	}

}
