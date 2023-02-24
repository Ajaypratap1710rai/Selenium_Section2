package section2_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyBoardHandleling {
   public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   	  WebDriver driver=new ChromeDriver();
	   	  driver.manage().window().maximize();
	   	  driver.get("https://www.flipkart.com/");
	   	  Thread.sleep(2000);
	   	  driver.findElement(By.xpath("//button[text()='✕']")).click();
	   	  driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
  }
}
