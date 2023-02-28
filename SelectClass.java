package section2_selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   	  WebDriver driver=new ChromeDriver();
   	  driver.manage().window().maximize();
   	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   	  driver.get("file:///C:/Selenium/htmlpage.html");
   	  WebElement movies=driver.findElement(By.id("//option[text()='****SELECT HERO****']"));
   	  Select s=new Select(movies);
   	  s.selectByVisibleText("SRK");
   	  Thread.sleep(2000);
   	  s.selectByVisibleText("VISHAL RAI");
   	  Thread.sleep(1000);
   	  s.deselectByVisibleText("SRK");
}
}
