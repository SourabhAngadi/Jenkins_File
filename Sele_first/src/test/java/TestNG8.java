import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestNG8 {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  Thread.sleep(3000);
	  WebElement username = driver.findElement(By.name("username"));
	  WebElement password = driver.findElement(By.name("password"));
	  WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	  username.sendKeys("Admin");
	  password.sendKeys("admin123");
	  submit.click();
  }
  @Parameters("browser")
  @BeforeMethod
  public void beforeMethod(String b1) {
	  if(b1.equals("Chrome")) {
		  WebDriver  driver = new ChromeDriver();
		  String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		  driver.get(url);
		  driver.manage().window().maximize();
	  }
	  else if (b1.equals("edge")) {
		  WebDriver driver = new EdgeDriver();
		  String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		  driver.get(url);
		  driver.manage().window().maximize();
	  }
  }

}
