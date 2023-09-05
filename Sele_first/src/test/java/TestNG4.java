import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG4 {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.youtube.com/");

  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("over");

  }

}
//public class  aBc{
//	WebDriver driver;
//	  @Test
//	public void a1() {
//		System.out.println("Hello");
//	}
//
//	}

