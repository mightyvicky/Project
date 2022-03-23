package com.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sheet_Read {
	
public static void Particular_cell_Data() throws IOException  {
	
	File xl=new File("C:\\Users\\vivekrajvedachalam\\eclipse-workspace\\Maven_Project\\Trail sheet.xlsx");
	
	FileInputStream fs= new FileInputStream(xl);
	
	Workbook w=new XSSFWorkbook(fs);
	
	Sheet sh=w.getSheetAt(0);
	
	Row rw=sh.getRow(4);
	
	Cell cl=rw.getCell(1);
	
	CellType tp=cl.getCellType();
	
	if (tp.equals(CellType.STRING)) {
		String cvalue=cl.getStringCellValue();
		System.out.println("Cell Value:"+cvalue);
		
	}
	else if (tp.equals(CellType.NUMERIC)) {
		
		double cvalue= cl.getNumericCellValue();
		
		int value= (int) cvalue;
		
		System.out.println("Cell Value:"+ value);
	}
	
	w.close();
   
	}
	
	 
    public static void main(String[] args) throws IOException {
		
    	Particular_cell_Data();
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	

