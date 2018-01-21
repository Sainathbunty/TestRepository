package testscripts;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NavigateToGoogle {

	public static void main(String[] args) {		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine
 
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("http://www.google.com");
	}
}