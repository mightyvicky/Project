package com.Maven_Project;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Pom.Page_Object_Manager;

public class Logger_Runner extends Base_Class {
	
	
	
	
	
	public static WebDriver driver = broswer_selection("chrome");
	public static Page_Object_Manager page_object=new Page_Object_Manager(driver);
    public static Logger logg = Logger.getLogger(Logger_Runner.class);
    
		public static void main(String[] args) throws IOException {
			
			PropertyConfigurator.configure("log4j.properties");
			geturl("http://automationpractice.com");
			
			logg.info("URL Launch");
			ClickonElement(page_object.get_Instance_Home().getLogin_Btn());
			inputvalueElement(  getdata("C:\\Users\\vivekrajvedachalam\\Documents\\Test Case.xlsx", 0, 7, 3));
			inputvalueElement(getdata("C:\\\\Users\\\\vivekrajvedachalam\\\\Documents\\\\Test Case.xlsx", 0, 8, 3));
			//inputvalueElement(page_object.get_Instance_Login().getEmail(), "purest01@gmail.com");
			//inputvalueElement(page_object.get_Instance_Login().getPassword(), "qwerty");
			ClickonElement(page_object.get_Instance_Login().getLogin_Btn());
			logg.info("Credentials Entered In Field");
			
			close();

			
		}

		private static void inputvalueElement(String getdata) {
			// TODO Auto-generated method stub
			
		}

		
	
}
