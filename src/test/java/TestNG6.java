import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG6 {
	  WebDriver driver;

  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
  }
  @Test(dependsOnMethods={"f"})
  public void f1() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.bing.com/");
	  driver.findElement(By.id("sb_form_q")).sendKeys("Hello",Keys.ENTER);
  }
  @Test(dependsOnMethods={"f","f1"})
  public void f2() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.opencart.com/");
	  driver.findElement(By.name("search")).sendKeys("Hello",Keys.ENTER);
  }
  
}

