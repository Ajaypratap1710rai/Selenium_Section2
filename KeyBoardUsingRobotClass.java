package section2_selenium.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardUsingRobotClass {
  public static void main(String[] args) throws AWTException {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   	  WebDriver driver=new ChromeDriver();
   	  driver.manage().window().maximize();
   	  driver.get("https://demo.actitime.com/login.do");
   	  driver.findElement(By.id("username")).sendKeys("admin");
   	  Robot r=new Robot();
   	  
   	  //Select
   	  r.keyPress(KeyEvent.VK_CONTROL);
   	  r.keyPress(KeyEvent.VK_A);
   	  r.keyRelease(KeyEvent.VK_CONTROL);
      r.keyRelease(KeyEvent.VK_A);
      
      //Copy
      r.keyPress(KeyEvent.VK_CONTROL);
   	  r.keyPress(KeyEvent.VK_C);
   	  r.keyRelease(KeyEvent.VK_CONTROL);
      r.keyRelease(KeyEvent.VK_C);
      
      //Go to password Filed
      r.keyPress(KeyEvent.VK_TAB);
      r.keyRelease(KeyEvent.VK_TAB);
      
      //Paste
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_V);
      r.keyRelease(KeyEvent.VK_CONTROL);
      r.keyRelease(KeyEvent.VK_V);
}
}
