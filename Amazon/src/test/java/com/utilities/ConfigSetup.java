package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigSetup {
	Properties pro;
	public ConfigSetup()
	{
		File src = new File("./Config/Config.properties");
		
				try {
					FileInputStream fis = new FileInputStream(src);
					pro = new Properties();
					pro.load(fis);
					
				} catch (IOException e) {
					System.out.print("Unable to load file" + e.getMessage());
				}
		
				
	}
	
	public  String getBrowser() {
		return pro.getProperty("browser");
		
	}
	
	public String getURL() {
		return pro.getProperty("testURL");
	}
}
