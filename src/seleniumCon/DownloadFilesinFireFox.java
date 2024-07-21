package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFilesinFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\DeleteMe\\SeleniumConcepts\\Drivers\\geckodriver.exe");
		String downloadPath="E:\\regular class\\Remote State Code";
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain");
		profile.setPreference("browser.download.folderList",2);// 0 will get download in Desktop
		profile.setPreference("browser.download.dir",downloadPath);
		
		FirefoxOptions options=new FirefoxOptions(); 
		options.setProfile(profile);
		
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='File Download']")).click();
		driver.findElement(By.xpath("//a[text()='some-file.txt']")).click();
		
	}

}
