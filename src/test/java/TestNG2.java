import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG2 {
	WebDriver driver;
	
  @Test
  public void f() {
      driver = new ChromeDriver();
      driver.get("https://demo.opencart.com/");
      driver.manage().window().maximize();
//	  driver.quit();
  }
  
  @Test
  public void a() {
      driver = new ChromeDriver();
      driver.get("https://google.com/");
      driver.manage().window().maximize();
//	  driver.quit();
  }
  @BeforeMethod
  public void beforemethod() {
	  WebDriverManager.chromedriver().setup();
  }
  @AfterMethod
  public void aftermethod() {
	  System.out.println("Happy!!!");
	  driver.quit();

  }
}
