package section2_selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignemnet1 {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.flipkart.com/");
	     driver.findElement(By.xpath("//button[text()='✕']")).click();
	     WebElement text=driver.findElement(By.cssSelector("[type='text']"));
	     text.sendKeys("iphone X");
	     text.submit();
	     WebElement drag=driver.findElement(By.cssSelector("[class='_31Kbhn _28DFQy']"));
	     Actions act=new Actions(driver);
	     act.dragAndDropBy(drag, 100, 0).perform();
	     
}
}
