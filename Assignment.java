package section2_selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {
	public static void main(String[]args) throws InterruptedException
	   {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.flipkart.com/");
		   driver.findElement(By.xpath("//button[text()='✕']")).click();
		   driver.findElement(By.name("q")).sendKeys("iphone x");
		   driver.findElement(By.cssSelector("[type='submit']")).click();
		   
		   WebElement slider=driver.findElement(By.className("_31Kbhn"));
		   Actions act=new Actions(driver);
         act.moveToElement(slider).dragAndDropBy(slider,45,0).build().perform();
		   
	   }
}
