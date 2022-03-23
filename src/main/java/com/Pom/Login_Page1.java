package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page1 {
	public WebDriver driver;
	
	@FindBy(id = "email")
	
	private WebElement email;
	
	public Login_Page1(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEmail() {
		return email;
		
	}
	
	public WebElement getPassword() {
		
		return password;
		
	}
	public WebElement getLogin_Btn() {
		return login_Btn;
		
	}
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")
	private WebElement login_Btn;
	
}
