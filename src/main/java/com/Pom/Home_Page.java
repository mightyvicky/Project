package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page {
	public Home_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@FindBy(className = "login")
	public static WebElement log;
	
	@FindBy(id = "email")
	public static WebElement email;
	@FindBy(id = "passwd")
	public static WebElement pass;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")
	public static WebElement button;
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]")
	public static WebElement cloth;
	@FindBy(xpath ="/html/body/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/form/div/div[1]/ul/li[3]/div/span/input" )
	public static WebElement size;
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_3\"]/li[2]/label/a")
	public static WebElement colour;
	@FindBy(xpath ="/html/body/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/form/div/div[4]/ul/li/div/span/input" )
	public static WebElement fabric;
@FindBy (xpath = "//*[@id=\"center_column\"]/ul/li")
public static WebElement imgselction;
@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]")
public static WebElement card;
	@FindBy(xpath ="/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a" )
	public static WebElement select;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")
	public static WebElement proceed;
	@FindBy(xpath ="/html/body/div/div[2]/div/div[3]/div/form/p/button" )
	public static WebElement nxt1;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input")
	public static WebElement nxt2;
	
	@FindBy(xpath ="/html/body/div/div[2]/div/div[3]/div/div/form/p/button" )
	public static WebElement nxt3;
	
	
		
	
}
