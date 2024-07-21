package seleniumCon;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;

public class DownloadFilesinChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\DeleteMe\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		String downloadPath="E:\\regular class\\Remote State Code";
		HashMap<String,Object> chromePrefs=new HashMap<String,Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='File Download']")).click();
		driver.findElement(By.xpath("//a[text()='some-file.txt']")).click();
		
		Assert.assertEquals(downloadPath, downloadPath);
	}

}
