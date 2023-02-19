package section2_selenium.java;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarAssignment {
	public static void main(String[]args) throws InterruptedException, IOException, AWTException
	   {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://jqueryui.com/datepicker/");
			//change to frame
			driver.switchTo().frame(0);
			//click on datetext
			   driver.findElement(By.id("datepicker")).click();
			   //initialize
			    String expectedDate="17-October-2000";	
				String expectedmonth=expectedDate.split("-")[1];
				String expectedyear=expectedDate.split("-")[2];
				String expecteddate=expectedDate.split("-")[0];
				System.out.println(expectedmonth+" "+expectedyear+" "+expecteddate);
				//click on previous button
			   driver.findElement(By.className("ui-icon-circle-triangle-w")).click();
			   //fetch month
			   String actualmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			   //fetch year
			   String actualyear=driver.findElement(By.className("ui-datepicker-year")).getText();  
			    while((!actualmonth.equals(actualmonth)) && (!actualyear.equals(expectedyear)))
					   {
					    driver.findElement(By.className("ui-datepicker-prev")).click();
				        actualmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
				         actualyear=driver.findElement(By.className("ui-datepicker-year")).getText();  
				        }

			   List<WebElement> alldate=driver.findElements(By.className("ui-state-default"));
			   for (WebElement date:alldate)
			   {  
				   
				   if(date.getText().equals(expecteddate))
				   {
					   date.click();
					   System.out.println(date);
				 }
				   }
			
	   }
}
