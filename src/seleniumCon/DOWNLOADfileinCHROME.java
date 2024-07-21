package seleniumCon;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DOWNLOADfileinCHROME {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		
		HashMap<String,Object> pref=new HashMap<String,Object>();
		
		pref.put("plugins.always_open_pdf_externally", false);
		pref.put("download.default_directory", "D:\\New Selenium");
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", pref);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[text()='LambdaTest.txt']")).click();
	}

}
