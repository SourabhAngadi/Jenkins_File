package com.selenium.Sele_first;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay_07 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        Actions a = new Actions(driver);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.manage().window().maximize();
//        driver.get("https://demoqa.com/frames");
        
        //switching through frames
//        driver.switchTo().frame("frame1");
//        WebElement e = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
//        System.out.println(e.getText());
        
        //Example on Select
//        driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=pd.name&order=DESC");
//        Select s = new Select(driver.findElement(By.xpath("//select[@id='input-sort']")));
//        List<WebElement> list1 = s.getOptions();
//        List<String> list2 = new ArrayList();
//        for(WebElement wb : list1) {
//        	System.out.println(wb.getText());
//        for(int i = 0; i<list1.size(); i++) {
//            list2.add(list1.get(i).getText());
        
//        }
        //s.selectByIndex(3);
//        s.selectByValue("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=p.price&order=ASC");
//        Collections.sort(list2);
//        System.out.println("---------Sorted-------");
//        for(String sorted: list2) {
//            System.out.println(sorted);
//        }
        
//		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
//		WebElement d  = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
//		Select s = new Select(d);
//		//List<WebElement> t = new ArrayList<WebElement>(); t=s.getOptions();
//		s.selectByIndex(2);
//		Thread.sleep(3000);
//		s.selectByIndex(3);
//		List<WebElement> l1 = new ArrayList<WebElement>();
//		l1=s.getAllSelectedOptions();
//		for(WebElement element : l1) {
//		System.out.println(element.getText());
//		}
//		s.deselectAll();
//		System.out.println("-------------------------------------------------------------------------------");
		
//		driver.get("http://omayo.blogspot.com/");
//		WebElement tb1 = driver.findElement(By.xpath("//table[@id='table1']//tr"));
//		WebElement tb2 = driver.findElement(By.xpath("//table[@id='table1']//tbody"));
//		System.out.println(tb1.getText());
//		System.out.println(tb2.getText());
		
		//date,alert
//        driver.get("https://www.abhibus.com/");
//        WebElement src = driver.findElement(By.xpath("//input[@id='source']"));
//        src.sendKeys("Pune");
//        WebElement dest = driver.findElement(By.xpath("//input[@id='destination']"));
//        dest.sendKeys("Mumbai");
//        WebElement dateofdept = driver.findElement(By.xpath("//input[@id='datepicker1']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].setAttribute('value','04/10/2023')", dateofdept);
//        driver.findElement(By.xpath("//a[@style='margin-left: -3px']")).sendKeys(Keys.ENTER);
        
//        driver.get("https://demo.guru99.com/test/delete_customer.php");
//        WebElement g1 = driver.findElement(By.xpath("//input[@name='cusid']"));
//        g1.sendKeys("301");
//        driver.findElement(By.xpath("//input[@name='submit']")).click();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        Thread.sleep(3000);
//        Alert alert1 = driver.switchTo().alert();
//        String aMsg = alert1.getText();
//        alert1.accept();
//        System.out.println(aMsg);
//        alert1.dismiss();
//       ;
		
        //Thread.sleep(3000);
        //driver.quit();
        
        driver.get("https://demo.smart-hospital.in/site/login");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[2]/a[2]")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();

        

        driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[8]/a")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div[1]/div/a[1]")).click();

        

        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("ABC");

         WebElement webelement =  driver.findElement(By.xpath("/html/body"));

         Actions action = new Actions(driver);   

            action.moveToElement(webelement).click().perform();

            action.sendKeys("Entering data").perform();

            

        

        Thread.sleep(3000);

        

        WebElement datepicker1 = driver.findElement(By.xpath("//input[@id=\"date\"]"));

        

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].setAttribute('value','05/03/2022')", datepicker1);
        WebElement datepicker2 = driver.findElement(By.xpath("//*[@id=\"publish_date\"]"));
        js.executeScript("arguments[0].setAttribute('value','09/22/2022')", datepicker2);
        //click on send

        driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[3]/div/button")).click();

        

        WebElement successfull_msg = driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[2]/div/div[1]"));

        String msg = successfull_msg.getText();

        System.out.println(msg);

//        Alert alert = driver.switchTo().alert();

//        String msg = alert.getText();

//        System.out.println(msg);

        

//        Thread.sleep(3000);

//        driver.close();
	}

}
