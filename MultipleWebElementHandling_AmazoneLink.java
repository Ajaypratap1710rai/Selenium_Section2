package section2_selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElementHandling_AmazoneLink {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   	  WebDriver driver=new ChromeDriver();
   	  driver.manage().window().maximize();
   	  driver.get("https://www.amazone.in/");
   	  List<WebElement> allLinks= driver.findElements(By.xpath("//a"));
   	  for(WebElement link:allLinks)
   	  {
   		  System.out.println(link.getText());
   	  }
}
}
