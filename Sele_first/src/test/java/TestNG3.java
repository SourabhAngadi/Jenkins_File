import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNG3 {
	WebDriver driver; 
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
      driver.get("https://google.com/");
	  driver.quit();

  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Hello");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Bye");
  }

}
