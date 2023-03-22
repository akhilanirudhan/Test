package com.selenium_test;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOne {
	WebDriver driver;
	@Test
	void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\support\\driver\\Chrome\\chromedriver.exe");
		
		  driver = new ChromeDriver();
		  System.out.println(driver);
			driver.get("www.flipkart.com");
			driver.manage().window().maximize();
	}
	
//	@BeforeTest
//	void testone() {
//		System.out.println("before test");
//		driver.get("www.flipkart.com");
//		driver.manage().window().maximize();
//	}
//	
//	@Test()
//	void testtwo() {
//		System.out.println("test one");
//	}
//	@Test(priority = 0)
//	void testfive() {
//		System.out.println("test five");
//	}
//	@Test(priority=1)
//	void testthree() {
//		System.out.println("test two");
//	}
//	@AfterTest
//	void testfour() {
//		System.out.println("after test");
//	}
//

}
