package com.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

	
		//to launch an application
		public static WebDriver launchApplication(WebDriver driver,String browserName, String url) {
			if(browserName.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			else if(browserName.equals("Firefox")) {
				System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			}
			else {
				System.out.println("Browser doesn't exists");
			}
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
			
		}
		
		
		//to close the browser
		public static void quitBrowser(WebDriver driver) {
			driver.quit();
		}
	}

