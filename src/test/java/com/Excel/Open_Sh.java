package com.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Open_Sh {

public static void main(String[] args) throws IOException {
	

	File xl=new File("C:\\Users\\vivekrajvedachalam\\Desktop\\OnePlus.xlsx");

	FileInputStream fs = new FileInputStream(xl);
	
	Workbook w = new XSSFWorkbook(fs);
	
	w.createSheet("Star_Data").createRow(0).createCell(0).setCellValue("Name");
	w.getSheet("Star_Data").getRow(0).createCell(1).setCellValue("Password");
	w.getSheet("Star_Data").createRow(1).createCell(0).setCellValue("Naveen");
	w.getSheet("Star_Data").getRow(1).createCell(1).setCellValue("qwerty");
	w.getSheet("Star_Data").createRow(2).createCell(0).setCellValue("Prabu");
	w.getSheet("Star_Data").getRow(2).createCell(1).setCellValue("dhgft123");
	w.getSheet("Star_Data").createRow(3).createCell(0).setCellValue("Ramanan");
	w.getSheet("Star_Data").getRow(3).createCell(1).setCellValue("123@3sdr$");
	FileOutputStream fos = new FileOutputStream(xl);
	
	w.write(fos);
	w.close();
	
	
	System.out.println("User Data Writed Successfully");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



	
}
