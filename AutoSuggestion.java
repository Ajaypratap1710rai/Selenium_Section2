package section2_selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   	  ChromeDriver driver=new ChromeDriver();
   	  driver.manage().window().maximize();
   	  driver.get("https://www.amazon.in/");
   	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
   	  Thread.sleep(2000);
   	  List<WebElement>allsug=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
   	  for(WebElement sug:allsug)
   	  {
   		  System.out.println(sug.getText());
   	  }
}
}
