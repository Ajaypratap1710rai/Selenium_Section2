package section2_selenium.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailHandling {
  public static void main(String[] args) throws AWTException {
	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.google.co.in/");
	   WebElement gmail=driver.findElement(By.linkText("Gmail"));
	   Actions act=new Actions(driver);
	   act.moveToElement(gmail).contextClick().build().perform();
	   Robot r=new Robot();
	   r.keyPress(KeyEvent.VK_DOWN);
	   r.keyRelease(KeyEvent.VK_DOWN);
	   r.keyPress(KeyEvent.VK_DOWN);
	   r.keyRelease(KeyEvent.VK_DOWN);
	   r.keyPress(KeyEvent.VK_ENTER);
	   r.keyRelease(KeyEvent.VK_ENTER);
}
}
