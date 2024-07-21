package seleniumCon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownLoadFILEInFIREFOX {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\DeleteMe\\SeleniumConcepts\\Drivers\\geckodriver.exe");
		
		FirefoxProfile prof=new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain");
		prof.setPreference("browser.download.folderList", 2);
		prof.setPreference("browser.download.dir", "E:\\localGit");
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(prof);
		WebDriver driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[text()='LambdaTest.txt']")).click();
		
		
	}

}
