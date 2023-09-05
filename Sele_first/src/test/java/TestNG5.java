import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG5 {
	  WebDriver driver;
  @Test(priority = -1)//negative value has lowest priority
  public void a() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  String str = "Google";
	  String a = driver.getTitle();
	  System.out.println(a);
	  Assert.assertEquals(str,a);
	 // Assert.assertNotEquals(str,a);
	  
	  //driver.quit();
	  }
  @Test(priority = 1)
  public void b() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.bing.com/");
	  //driver.manage().window().maximize();
	  String str1 = "Bing";
	  String b = driver.getTitle();
	  System.out.println(b);
	  Assert.assertEquals(str1,b);
	  //Assert.assertNotEquals(str,a);
	  
	  //driver.quit();
}
  @Test
  public void c() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.opencart.com/");
	  //driver.manage().window().maximize();
	  String str2 = "Your Store";
	  String c = driver.getTitle();
	  System.out.println(c);
	  Assert.assertEquals(str2,c);
	  //Assert.assertNotEquals(str,a);
	  
	  //driver.quit();
  
  }
}
