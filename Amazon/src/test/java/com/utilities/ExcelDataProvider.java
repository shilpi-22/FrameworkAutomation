package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	
	
	public ExcelDataProvider() throws FileNotFoundException {
		
		 try {
			 File src = new File("./TestData/TestData.xlsx");
				FileInputStream fis = new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
		} catch (IOException e) {
			System.out.println("Unable to load excel " + e.getMessage());
		}
	}
	
	public String getUsername() {
		return wb.getSheet("LogInDetails").getRow(0).getCell(0).getStringCellValue();
	}
	
	public String getPassword() {
		return wb.getSheet("LogInDetails").getRow(0).getCell(1).getStringCellValue();
	}
}
