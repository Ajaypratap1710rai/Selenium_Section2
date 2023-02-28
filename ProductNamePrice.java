package section2_selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductNamePrice {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   	  WebDriver driver=new ChromeDriver();
   	  driver.manage().window().maximize();
   	  driver.get("https;//www.flipkart.com/");
      driver.findElement(By.xpath("//button[text()='✕']")).click();
 	  driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
 	  Thread.sleep(2000);
 	  List<WebElement> allproductname=driver.findElements(By.xpath("//div[@class='MIXNux']/following-sibling::div[1]/div[1]/div[contains(text(),'APPLE iPhone')]"));
      for(WebElement productname:allproductname)
      {
    	  String pn=productname.getText();
    	  String productprice=driver.findElement(By.xpath("//div[text()='"+pn+"']/../..div[2]/div[1]/div[1]/div")).getText();
    	  
    	  System.out.println(pn+"------>"+productprice);
      }
}
}
