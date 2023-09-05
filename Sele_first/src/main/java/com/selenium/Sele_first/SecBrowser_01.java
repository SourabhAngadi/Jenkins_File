package com.selenium.Sele_first;

import java.util.Set;

import javax.swing.text.TabableView;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SecBrowser_01 {

	public static void main(String[] args) throws InterruptedException {
		//setting up driver
		WebDriverManager.edgedriver().setup();
		//creating driver object foe web driver class(driver is mapped with edge driver)
		WebDriver driver=new EdgeDriver();
		//driver.get("https://www.google.co.in/");
		//Maximize
		driver.manage().window().maximize();
//		driver.get("https://www.google.co.in/");
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		String s = driver.getPageSource();
		System.out.println(s.length());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.co.in/");
		Set<String> handles = driver.getWindowHandles();
		for(String h:handles) {
			System.out.println(h);
			System.out.println(driver.switchTo().window(h));
			System.out.println(driver.getTitle());
			//System.out.println(driver.getWindowHandle());

		}
		
	}

}
