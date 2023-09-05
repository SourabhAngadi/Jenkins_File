package com.selenium.Sele_first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDay_5 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sangadi\\OneDrive - Expleo France\\Desktop\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.setBinary("C:\\Users\\sangadi\\OneDrive - Expleo France\\Desktop\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		//driver.get("https://www.google.com/");
		
		//Implicit wait
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
//		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
//		//clicking login button
//		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
//		//waiting to load the page and click on profile
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
//		//waiting to load and logout of page and return to login page
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
//		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.name("username"))).sendKeys("Admin");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("admin123");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))).click();
        //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/spant")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Admin"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"))).sendKeys("Admin");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout"))).click();
        driver.quit();


	}

}
