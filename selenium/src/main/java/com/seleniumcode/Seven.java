package com.seleniumcode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.drive", "E:\\support\\driver\\edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement popup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		if(popup.isDisplayed()) {
			popup.click();
		}
		
		WebElement travel = driver.findElement(By.xpath("//*[text()='Travel']"));
		travel.click();
		
		 wait.until(ExpectedConditions.visibilityOf(travel));
		 WebElement from = driver.findElement(By.xpath("//*[text()='From']"));
		from.sendKeys("kochi");
		
		
		WebElement destn = driver.findElement(By.xpath("//*[text()='To']/preceding-sibling::input"));
		destn.sendKeys("delhi");
		
		
		
	}

}
