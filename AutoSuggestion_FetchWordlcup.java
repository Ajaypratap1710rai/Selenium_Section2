package section2_selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_FetchWordlcup {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   	  ChromeDriver driver=new ChromeDriver();
   	  driver.manage().window().maximize();
   	  driver.get("https://www.google.co.in/");
   	  driver.findElement(By.name("q")).sendKeys("WorldCup");
   	  Thread.sleep(2000);
   	  List<WebElement>allsug=driver.findElements(By.xpath("//div[@class='eIPGRd']"));
   	  for(WebElement sug:allsug)
   	  {
   		String suggestion=sug.getText();
   		if(suggestion.contains("cup 2022"))
   		{
   			  sug.click();
     		  break;
   		}
   	  }
   	  WebElement title=driver.findElement(By.xpath("//div[@id='result-stats']"));
   	  {
   		  System.out.println(title.getText());
   	  }
   	  
}
}
