package section2_selenium.java;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowOrangeHRM_assignment{
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	  driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click();
	  driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click();
	  driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[3]")).click();
	  Set<String> allId=driver.getWindowHandles();
	  for(String id:allId)
	  {
		  driver.switchTo().window(id);
		  String title=driver.getTitle();
		  if(title.contains("LinkedIn"))
		  {
			  System.out.println(title);
		  }
		  else
		  {
			  driver.close();
		  }
	  }
      
  }
}
