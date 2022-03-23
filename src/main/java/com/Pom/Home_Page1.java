package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page1 {
	
	
	public WebDriver driver;
	
	@FindBy(className = "login")
	
	private WebElement login_Btn;
	
	public  Home_Page1(WebDriver driver2){
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getLogin_Btn () {
		
		return login_Btn;
	}
}
