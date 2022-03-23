package com.Maven_Project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Pom.Page_Object_Manager;

public class Data_Driven_Runner extends Base_Class {
	
	
	
	
public static WebDriver driver = broswer_selection("chrome");
public static Page_Object_Manager page_object=new Page_Object_Manager(driver);


public static void main(String[] args) throws IOException {
	
geturl("http://automationpractice.com");

ClickonElement(page_object.get_Instance_Home().getLogin_Btn());
inputvalueElement(  getdata("C:\\Users\\vivekrajvedachalam\\Documents\\Test Case.xlsx", 0, 7, 3));
inputvalueElement(getdata("C:\\\\Users\\\\vivekrajvedachalam\\\\Documents\\\\Test Case.xlsx", 0, 8, 3));
//inputvalueElement(page_object.get_Instance_Login().getEmail(), "purest01@gmail.com");
//inputvalueElement(page_object.get_Instance_Login().getPassword(), "qwerty");
ClickonElement(page_object.get_Instance_Login().getLogin_Btn());
close();


}


private static void inputvalueElement(String getdata) {
	// TODO Auto-generated method stub
	
}
}