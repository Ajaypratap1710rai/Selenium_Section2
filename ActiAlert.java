package section2_selenium.java;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiAlert {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_new\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class=\"topMenuButton preventPanelsHiding\"][2]")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.name("name")).sendKeys("AJAY");
		driver.findElement(By.xpath("//input[@type=\"button\"][1]")).click();
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		System.out.println(msg);
		alt.dismiss();
		WebElement screen=driver.findElement(By.className("pagetitle"));
		File src=screen.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/acti.png");
		FileUtils.copyFile(src,trg);
		driver.close();
		

	}
}
