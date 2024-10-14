package com.excle.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	static WebDriver driver;
	
	
	public static WebDriver intializeBrowser() throws Exception {
		String browser="chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Hybrid\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("facebook.com");
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver", "");
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "");
			driver=new FirefoxDriver();
		}
		else {
			throw new Exception ("incorrect browser");
		}
		
		return driver;
		
		
	}
	
	
	public void tearDown() {
		
	}
	

}
