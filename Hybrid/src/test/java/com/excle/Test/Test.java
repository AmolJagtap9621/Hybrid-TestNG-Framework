package com.excle.Test;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Hybrid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// Navigate to BStackDemo Website
		driver.get("https://bstackdemo.com/");

		// Finding all the available links on webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Iterating each link and checking the response status
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			URL link1 = new URL(url);
			HttpURLConnection httpURLConnection = (HttpURLConnection) link1.openConnection();
			httpURLConnection.setConnectTimeout(3000);
			httpURLConnection.connect();

			if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(url + "-" + httpURLConnection.getResponseMessage());
			} else {
				System.out.println(url + "-" + httpURLConnection.getResponseMessage() + "-" + "is a broken link");
			}
		}

		driver.quit();
	}

}
