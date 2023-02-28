package section2_selenium.java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri_assignment {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
	  WebElement Jobs=driver.findElement(By.xpath("//div[text()='Jobs']"));
	  Actions act=new Actions(driver);
	  act.moveToElement(Jobs).perform();
	  driver.findElement(By.xpath("//div[text()='IT jobs']")).click();
	  driver.findElement(By.linkText("Java Developer")).click();
	  String mainId=driver.getWindowHandle();
	  Set<String> allId=driver.getWindowHandles();
	  for(String id:allId)
	  {
		  if(!(mainId.equals(id)))
		  {
			  driver.switchTo().window(id);
		  }
		  	  
	  }
	  String msg=driver.findElement(By.xpath("//h2[text()='Job you might to interested is']")).getText();
	  System.out.println(msg);
	  driver.close();
	  driver.switchTo().window(mainId);
	  System.out.println(driver.getTitle());
	  
	  
	  
}
}
