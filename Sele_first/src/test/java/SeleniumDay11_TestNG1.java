import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay11_TestNG1 {
	//WebDriver driver;
	
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.bing.com/");
      driver.manage().window().maximize();
  }
 
  @Test
  public void f1() {
	  WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.orangehrm.com/");
      driver.manage().window().maximize();
  }
  
  
  
  
}
