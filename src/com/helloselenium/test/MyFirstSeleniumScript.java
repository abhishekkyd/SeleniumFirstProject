package com.helloselenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumScript {

    public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();

	driver.manage().window().maximize();
	driver.get("http://www.google.com");

	try {
	    googleSearch(driver, "Hello Selenium");
	    googleSearch(driver, 12345);
	    googleSearch(driver, 56);
	    googleSearch(driver, 865);
	    googleSearch(driver, 2567);
	    googleSearch(driver, "688");
	} catch (Exception e) {
	    e.printStackTrace();
	}

	driver.quit();
    }

    public static void googleSearch(WebDriver driver, String keyword)
	    throws Exception {

	driver.findElement(By.name("q")).clear();
	driver.findElement(By.name("q")).sendKeys(keyword);
	driver.findElement(By.name("btnG")).click();
	Thread.sleep(2000);
	System.out.println("Result stats for " + keyword + " is: "
		+ driver.findElement(By.id("resultStats")).getText());
	Thread.sleep(2000);
    }

    public static void googleSearch(WebDriver driver, int keyword)
	    throws Exception {

	driver.findElement(By.name("q")).clear();
	driver.findElement(By.name("q")).sendKeys(Integer.toString(keyword));
	driver.findElement(By.name("btnG")).click();
	Thread.sleep(2000);
	System.out.println("Result stats for " + keyword + " is: "
		+ driver.findElement(By.id("resultStats")).getText());
	Thread.sleep(2000);
    }
}
