package com.selenium.Sele_first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay_06 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        //driver.get("https://www.softwaretestingmaterial.com/");
		Actions actions = new Actions(driver);
//		driver.get("https://www.browserstack.com/guide/css-selectors-in-selenium");
//		driver.get("https://demoqa.com/droppable/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
//        Thread.sleep(3000);
//        
        //below() Locator example
//        WebElement ele1 =driver.findElement(RelativeLocator.with(By.name("username")).below(By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']")));
//        ele1.sendKeys("Admin");
//        WebElement ele2 = driver.findElement(RelativeLocator.with(By.name("password")).above(By.xpath("//button[@type='submit']")));
//        ele2.sendKeys("admin123");
        
        //above() Locator example
//		WebElement ele3 = driver.findElement(RelativeLocator.with(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']")).above(By.xpath("//div[@class='orangehrm-login-forgot']")));
//		ele3.click();
        
        //toLeftof() Locator example
//		WebElement ele4 = driver.findElement(RelativeLocator.with(By.xpath("//img[@class='wp-image-19484 ezlazyloaded']")).toLeftOf(By.xpath("//img[@class='wp-image-19488 ezlazyloaded']")));
//		ele4.click();
		
		//toRightof Locator example
//		WebElement ele5 = driver.findElement(RelativeLocator.with(By.xpath("//img[@class='wp-image-19485 ezlazyloaded']")).toRightOf(By.xpath("//img[@class='wp-image-19488 ezlazyloaded']")));
//		ele5.click();
		
        //near() Locator example
//		WebElement ele6 = driver.findElement(RelativeLocator.with(By.xpath("//a[@class='social-button footer-social-item social-link-youtube']")).near(By.xpath("//a[@class='social-button footer-social-item social-link-linkedin']")));
//		ele6.click();
        
        //using Explicit Wait
//        wait.until(ExpectedConditions.elementToBeClickable(RelativeLocator.with(By.xpath("//a[@class='social-button footer-social-item social-link-youtube']")).near(By.xpath("//a[@class='social-button footer-social-item social-link-linkedin']")))).click();
        
        //Usage of ActionsMouse
        //WebElement hovermouse = driver.findElement(By.xpath("//button[@id='products-dd-toggle']"));
//        WebElement hovermouse1 = driver.findElement(By.xpath("//a[@class='btn-primary btn-lg col-md-3 custom-btn-amp-events']"));
//        actions.moveToElement(hovermouse).perform();
//        actions.contextClick(hovermouse).perform();
//        actions.doubleClick(hovermouse1).perform();
//        WebElement srcElement = driver.findElement(By.id("draggable"));
//        WebElement destElement = driver.findElement(By.id("droppable"));
//        actions.clickAndHold(srcElement).release(destElement).build().perform();
//        actions.dragAndDrop(srcElement, destElement);
        
        //Sending Keys to google and making them in Uppercase
        driver.get("https://www.google.com/");
        WebElement upper = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        actions.keyDown(Keys.SHIFT).sendKeys("hello",Keys.ENTER).perform();
        
        driver.quit();
	}

}
