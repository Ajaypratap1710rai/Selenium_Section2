package section2_selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElementHandlin_EbayAllElement {
   public static void main(String[] args) {
	      System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   	  WebDriver driver=new ChromeDriver();
	   	  driver.manage().window().maximize();
	   	  driver.get("https://www.ebay.com/");
	   	  List<WebElement> allElement=driver.findElements(By.xpath("//*"));
	   	  for(WebElement ElementLink:allElement)
	   	  {
	   		  System.out.println(ElementLink.getText());
	   	  }
	   	  System.out.println(allElement.size());
}
}
