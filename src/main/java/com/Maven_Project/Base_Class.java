package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

private static String Value;
public static WebDriver driver;
public static WebDriver broswer_selection(String type) {
	if (type.equalsIgnoreCase("chrome")) {	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();	
	}
	else if (type.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir"+""));
		driver=new FirefoxDriver();	
	}
	driver.manage().window().maximize();
	return driver;
}
	public static void ClickonElement(WebElement element) {
		element.click();
	}
	public static void inputvalueElement(WebElement element,String data) {
		element.sendKeys(data);	
	}
	public static void close() {
		driver.close();	
	}
	public static void geturl(String url) {
		driver.get(url);
	}
	public static void dropdown(String type,WebElement element,String value) {
		Select s=new Select(element);
		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("byText")) {
			s.selectByVisibleText(value);
			
			
		}
		else if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
			}
	}

      public static String getdata(String path, int sheetindex, int rowindex, int cellindex) throws IOException {
    	  
    	
    	  File f=new File(path);
    	  FileInputStream fis = new FileInputStream(f);
    	  Workbook w = new XSSFWorkbook(fis);
    	  Sheet s = w.getSheetAt(sheetindex);
    	  Row r = s.getRow(rowindex);
    	  Cell c = r.getCell(cellindex);
    	  CellType type= c.getCellType();
    	  
    	if (type.equals(CellType.NUMERIC)) {
			double nv=c.getNumericCellValue();
			int i = (int) nv;
			Value = String.valueOf(i);
		}
    	  
    	  
    	else if (type.equals(CellType.STRING)) {
    		Value = c.getStringCellValue();
			
		}
    	  return Value;
      }	  
      
}
	


