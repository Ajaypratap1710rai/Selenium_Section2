package section2_selenium.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select_Handling {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://demo.actitime.com/login.do");
	   driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);
	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	   wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
	   driver.findElement(By.className("popup_menu_button_settings")).click();
	   driver.findElement(By.xpath("//div[contains(text(),'anage system settings')]/..")).click();
	   WebElement dropdown=driver.findElement(By.name("firstHierarchyLevelCode"));
	   dropdown.click();
	   driver.findElement(By.xpath("//option[text()='Product Line']")).click();
	   dropdown.click();
	   Select s=new Select(dropdown);
	   if(s.isMultiple())
	   {
	   System.out.println("It is multiselect dropdown.");
	   }
	   else
	   {
	   System.out.println("It is single select dropdown.");
	   }
}
}
