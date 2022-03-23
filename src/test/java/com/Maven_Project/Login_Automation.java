package com.Maven_Project;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.Pom.Home_Page;

public class Login_Automation extends Base_Class {
	public static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivekrajvedachalam\\Downloads\\Drivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver=broswer_selection("chrome");
		geturl("http://automationpractice.com");
		PageFactory.initElements(driver, Home_Page.class);
		Home_Page.log.click();
		Home_Page.email.sendKeys("purest01@gmail.com");
		Home_Page.pass.sendKeys("qwerty");
		Home_Page.button.click();
		Home_Page.cloth.click();
		Home_Page.size.click();
		Home_Page.colour.click();
		Home_Page.fabric.click();
		Thread.sleep(4000);
		Home_Page.imgselction.click();
		Home_Page.card.click();
		Home_Page.select.click();
		Home_Page.proceed.click();
		Home_Page.nxt1.click();
		Home_Page.nxt2.click();
		Home_Page.nxt3.click();
		close();
		
//		//driver.get("http://automationpractice.com");
//		//WebElement log=driver.findElement(By.className("login"));
//		//ClickonElement(log);
//		//WebElement user=driver.findElement(By.id("email"));
//		//inputvalueElement(user, "purest01@gmail.com");
//		//user.sendKeys("purest01@gmail.com");
//		//WebElement pass=driver.findElement(By.id("passwd"));
//		//inputvalueElement(pass, "qwerty");
//		//pass.sendKeys("qwerty");
//		WebElement button=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button"));
//		ClickonElement(button);
//		//button.click();
//		WebElement cloth=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]"));
//		ClickonElement(cloth);
//		//cloth.click();
//		WebElement size=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/form/div/div[1]/ul/li[3]/div/span/input"));
//        ClickonElement(size);
//        //size.click();
//        
//        WebElement colour=driver.findElement(By.xpath("//*[@id=\"ul_layered_id_attribute_group_3\"]/li[2]/label/a"));
//        ClickonElement(colour);
//        //colour.click();
//        
//        WebElement fabric=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/form/div/div[4]/ul/li/div/span/input"));
//        ClickonElement(fabric);
//        //fabric.click();
//   
//		WebElement add=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]"));
//		ClickonElement(add);
//		//add.click();
//		Thread.sleep(3000);
//		WebElement selec=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"));
//		ClickonElement(selec);
//		//selec.click();
//		WebElement procee=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]"));
//		ClickonElement(procee);
//		//procee.click();
//		WebElement ads=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
//		ClickonElement(ads);
//		//ads.click();
//		WebElement cl=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input"));
//		ClickonElement(cl);
//		//cl.click();
//		WebElement pr=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button"));
//		ClickonElement(pr);
//		//pr.click();
		
		
	}
	
	
	

}

