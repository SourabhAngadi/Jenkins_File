package com.selenium.Sele_first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Browser_01 {

	public static void main(String[] args) throws InterruptedException {
		//browser setup
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sangadi\\OneDrive - Expleo France\\Desktop\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\sangadi\\OneDrive - Expleo France\\Desktop\\chrome-win64\\chrome.exe");
		//co.addArguments("--remote-allow-origins=*");
		//chrome driver object
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://google.com/");
		//searching element by id and name that is present in console
		//driver.findElement(By.id("APjFqb")).sendKeys("bldea",Keys.ENTER);
		//WebElement searchbox = driver.findElement(By.id("APjFqb"));
		//searchbox.sendKeys("expleo",Keys.ENTER);
		//searchbox.sendKeys("expleo");
		//searchbox.clear();

		//driver.findElement(By.name("q")).sendKeys("expleo",Keys.ENTER);
		//click google search
		//driver.findElement(By.className("gN089b")).submit();
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.bing.com/");
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.mozilla.org/en-US/firefox/new/?redirect_source=firefox-com");
//		driver.quit();
		
//		WebElement searchbox = driver.findElement(By.xpath("//textarea[starts-with(@id,'AP')]"));
//		System.out.println(searchbox);
		
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
//		
//		driver.findElement(By.name("q")).sendKeys("Mobile",Keys.ENTER);
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label")).click();		
//		Thread.sleep(3000);
//		//display
//		List<WebElement> data = driver.findElements(By.className("_3879cV"));
//		for(WebElement webElement : data) {
//			System.out.println(webElement.getText());
//		}
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
//		WebElement e = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]"));
//		//System.out.println(e.isEnabled());
//        System.out.println(e.isEnabled()?"Enables":"Not Enabled");
//        System.out.println(e.isSelected()?"Selected":"Not Selected");
//        driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[4]")).click();
//        driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]")).click();
//        driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[6]")).click();
//        System.out.println((driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[1]")).isSelected())?"Selected":"Not Selected");
//        System.out.println((driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]")).isSelected())?"Selected":"Not Selected");
////        driver.quit();
		
        JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executeScript("window.scrollBy(0,3000)", "");
        //Thread.sleep(60000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.quit();
        
        
		
	
	}			

}

