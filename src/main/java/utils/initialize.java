package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class initialize {
	private static WebDriver driver;
	
	private initialize() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver=new ChromeDriver(options);
		
	}
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		if(driver==null) {
			new initialize();
		}
		return driver;
	}
	public static void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
		driver=null;
	}

}
