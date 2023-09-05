package com.selenium.Sele_first;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Imp_Exp_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sangadi\\OneDrive - Expleo France\\Desktop\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.setBinary("C:\\Users\\sangadi\\OneDrive - Expleo France\\Desktop\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		
		//Implicit wait
//		long starttime=System.currentTimeMillis();
//		driver.get("http://omayo.blogspot.com/");
//		driver.manage().window().maximize();
//		JavascriptExecutor jss = (JavascriptExecutor) driver;
//		jss.executeScript("window.scrollBy(0,3000)","");
//		driver.findElement(By.className("dropbtn")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//		long endtime=System.currentTimeMillis();
//		System.out.println(((endtime-starttime)/1000.0)+"seconds..");
//		driver.findElement(By.linkText("Facebook")).click();
		
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement webElement = driver.findElement(By.id("timerButton"));
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		webElement.click();
		
		//fluent wait
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.className("dropbtn")).click();
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10));
		WebElement optionElement = wait1.until
				(new Function<WebDriver,WebElement>(){
					public WebElement apply(WebDriver driver) {
						return driver.findElement(By.linkText("Facebook"));
					}
				});
				optionElement.click();
		
		
	}

}
