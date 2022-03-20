package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	//Screenshots, alerts, window, frames, Sync issue, Javascript executor
	
	public static String captureScreenshot(WebDriver driver) {
		File src =( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   String ssPath = System.getProperty("user.dir") + "./Screenshots" + getCurrentDateTime() + ".png";
		try {
			FileHandler.copy(src, new File(ssPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to take screenshot " + e.getMessage());
		}
		return ssPath;
	}
	
	public  static String getCurrentDateTime() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return customFormat.format(currentDate);
	}
}
