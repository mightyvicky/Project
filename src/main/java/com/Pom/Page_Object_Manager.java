package com.Pom;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
 
	
	public WebDriver driver;
	
	private Home_Page1 home;
	
	private Login_Page1 login;
	
	public Page_Object_Manager(WebDriver driver2) {
		
		
	this.driver= driver2;
		
	}
public Home_Page1 get_Instance_Home() {
		
		if (home==null) {
			home=new Home_Page1(driver);
		}
		
		return home;
	}
	
	public Login_Page1 get_Instance_Login() {
		
		if (login==null) {
			login=new Login_Page1(driver);
		}
		
		return login;
	}
	
	
	
	}

	
	
	
	
	
	
	
