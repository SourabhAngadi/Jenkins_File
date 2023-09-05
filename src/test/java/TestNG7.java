import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG7 {
	WebDriver driver;
  @Test(groups = "G1")
  public void First_fn() {
	  driver =new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
  }
  
  @Test(groups = "G2",dependsOnGroups = "G1")
  public void Second_fn() {
	  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium",Keys.ENTER);  
  }
  
  @Test(groups = "G2",dependsOnGroups = "G1")
  public void Third_fn() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
	  driver.navigate().back();
  }
  @Test(groups = "G3",dependsOnGroups = {"G1","G2"})
  public void fourth_fn() {
	  driver.quit();  
  }

}
