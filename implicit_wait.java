package section2_selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   	  ChromeDriver driver=new ChromeDriver();
	   	  driver.manage().window().maximize();
	   	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	      driver.get("https://demo.actitime.com/login.do");
	      driver.findElement(By.id("username")).sendKeys("admin");
	      driver.findElement(By.name("pwd")).sendKeys("manager");
	      driver.findElement(By.id("loginbutton")).click();
	      String titile=driver.getTitle();
	      System.out.println(titile);
	     
	}
}
