package section2_selenium.java;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeanddate {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/");
		Thread.sleep(2000);
		WebElement world=driver.findElement(By.linkText("World Weather"));
		Thread.sleep(1000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",world);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[contains(@class,'picker-city')])[2]")).sendKeys("banga");
		Thread.sleep(1000);
		List<WebElement> suggesion=driver.findElements(By.xpath("//span[@class='ash']"));
		for(WebElement sug:suggesion)
		{
			System.out.println(sug.getText());
			
		}	
		
	}
}
