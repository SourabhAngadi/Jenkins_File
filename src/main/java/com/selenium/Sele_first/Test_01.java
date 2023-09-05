package com.selenium.Sele_first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_01 {

	public static void main(String[] args) throws InterruptedException {
		//Browser Setup
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sangadi\\OneDrive - Expleo France\\Desktop\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.setBinary("C:\\Users\\sangadi\\OneDrive - Expleo France\\Desktop\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		//Opening google website
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		
		//login to facebook and entering invalid email and password
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//Coming back to side refreshing the site
		driver.navigate().back();
		driver.navigate().refresh();
		
		//checking forgot passward
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/form/div/div[2]/div/table/tbody/tr[2]/td[2]/input")).sendKeys("sourabhangadi@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/form/div/div[3]/div/div[1]/button")).click();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));


		//Entering valid email and password
		driver.findElement(By.id("email")).sendKeys("sourabhangadi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("");//pass not entered.
		
		//Login successful
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		
////		Searching username or sending friend request by searching there name
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div/div/div/div/div/label")).click();
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div/div/div[1]/div/div/label/input")).sendKeys("Pratik Sugandhi",Keys.ENTER);
		driver.quit();
	}

}
