package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import com.Pom.Page_Object_Manager;

public class Login_Page_Object_Manager extends Base_Class {
	public static WebDriver driver = broswer_selection("chrome");
public static Page_Object_Manager page_object=new Page_Object_Manager(driver);
public static void main(String[] args) {
	
geturl("http://automationpractice.com");
ClickonElement(page_object.get_Instance_Home().getLogin_Btn());

inputvalueElement(page_object.get_Instance_Login().getEmail(), "purest01@gmail.com");
inputvalueElement(page_object.get_Instance_Login().getPassword(), "qwerty");
ClickonElement(page_object.get_Instance_Login().getLogin_Btn());
close();




//WebElement log=driver.findElement(By.className("login"));
//ClickonElement(log);
//WebElement user=driver.findElement(By.id("email"));
//inputvalueElement(user, "purest01@gmail.com");
//user.sendKeys("purest01@gmail.com");
//WebElement pass=driver.findElement(By.id("passwd"));
//inputvalueElement(pass, "qwerty");
//pass.sendKeys("qwerty");
//WebElement button=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button"));
//ClickonElement(button);
//button.click();
	
}
	
	
	
	
}



