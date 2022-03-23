package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivekrajvedachalam\\eclipse-workspace\\selenium project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Maniyarasan");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Travel@123");
		String pass=password.getAttribute("value");
		System.out.println("Password:"+pass);
		WebElement log=driver.findElement(By.xpath("//input[@name='login']"));
		boolean ys=log.isEnabled();
		System.out.println("Is LoginButton Enable:"+ys);
		log.click();
		WebElement location=driver.findElement(By.xpath("//select[@name='location']"));
		Select se=new Select(location);
		se.selectByValue("Brisbane");
		WebElement hotel=driver.findElement(By.xpath("//select[@name='hotels']"));
	    Select hs=new Select(hotel);
	    hs.selectByIndex(2);
	    WebElement room=driver.findElement(By.id("room_type"));
	    Select rm=new Select(room);
	    rm.selectByVisibleText("Super Deluxe");
	    WebElement roo=driver.findElement(By.xpath("//select[@name='room_nos']"));
	    Select rom=new Select(roo);
	    rom.selectByIndex(5);
	    WebElement in=driver.findElement(By.xpath("//input[@name='datepick_in']"));
	    in.clear();
	    in.sendKeys("18/02/2022");
	    WebElement out=driver.findElement(By.xpath("//input[@name='datepick_out']"));
	    out.clear();
	    out.sendKeys("23/02/2022");
	    WebElement ad=driver.findElement(By.xpath("//select[@name='adult_room']"));
	    Select lt=new Select(ad);
	    lt.selectByValue("2");
	    WebElement ch=driver.findElement(By.xpath("//select[@name='child_room']"));
	    Select ld=new Select(ch);
	    ld.selectByIndex(4);
	    WebElement search=driver.findElement(By.name("Submit"));
	    search.click();
	    WebElement bu=driver.findElement(By.xpath("//input[@value='0']"));
	    bu.click();
	    WebElement con=driver.findElement(By.id("continue"));
	    con.click();
	    WebElement firstname=driver.findElement(By.xpath("(//input[@type='text'])[11]"));
	    firstname.sendKeys("Dhoni");
	    WebElement lastname=driver.findElement(By.xpath("(//input[@type='text'])[12]"));
	    lastname.sendKeys("Mahendra");
	    WebElement adr=driver.findElement(By.id("address"));
	    adr.sendKeys("No:12w Srivasan apartment, 2nd street, Chennai");
	   WebElement card= driver.findElement(By.xpath("(//input[@onkeypress='return OnlyNumbersonly(event)'])[1]"));
	   card.sendKeys("2345678901111213");
	   WebElement cardtype=driver.findElement(By.xpath("//select[@name='cc_type']"));
	   Select cc= new Select(cardtype);
	   cc.selectByVisibleText("VISA");
	   WebElement cmo=driver.findElement(By.id("cc_exp_month"));
	   Select mo=new Select(cmo);
	   mo.selectByValue("5");
	   WebElement year=driver.findElement(By.id("cc_exp_year"));
	   Select yr=new Select(year);
	   yr.selectByValue("2022");
	   WebElement cv= driver.findElement(By.xpath("(//input[@onkeypress='return OnlyNumbersonly(event)'])[2]"));
	   cv.sendKeys("123");
	   WebElement sum=driver.findElement(By.xpath("(//input[@type='button'])[1]"));
	   sum.click();
	   
		
		
		
		
		
		
		
	}
	
	
	
}
