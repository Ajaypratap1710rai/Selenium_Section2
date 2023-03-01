package section2_selenium.java;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteAssignment {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		   driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		   driver.switchTo().frame(0);
		   driver.findElement(By.xpath("//font[text()='Free Mock Tests']")).click();
		   String mainId=driver.getWindowHandle();
		   Set<String> allid=driver.getWindowHandles();
		   for(String id:allid)
		   {
			   if(!(id.equals(allid)))
			   {
				   driver.switchTo().window(id);
			   }
		   }
		   //driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-lefthide-in-mobile']/li[6]")).click();
		   driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-left hide-in-mobile']/li[6]")).click();
           WebElement shot=driver.findElement(By.tagName("h1"));
           File src=shot.getScreenshotAs(OutputType.FILE);
           File trg=new File("./screenshot/Insuranceimg.png");
           FileUtils.copyFile(src,trg);
           driver.close();
           for(String id:allid) {
        	   if(!(id.equals(mainId))) {
        		   driver.switchTo().window(mainId);
        	   }
           }
           String title=driver.getTitle();
           System.out.println(title);
           
           
	
		   
		   
	}
}
