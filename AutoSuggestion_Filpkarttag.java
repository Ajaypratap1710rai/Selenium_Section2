package section2_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Filpkarttag {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   	  ChromeDriver driver=new ChromeDriver();
   	  driver.manage().window().maximize();
   	  driver.get("https://www.flipkart.com/");
   	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("//button[text()='✕']")).click();
 	  driver.findElement(By.name("q")).sendKeys("toys");
 	  
}
}
