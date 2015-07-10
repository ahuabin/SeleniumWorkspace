package org.openqa.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	public static void main (String[] args) {
		WebDriver driver = new FirefoxDriver ();
		
		driver.get("http://home.binwise.com/");
		new WebDriverWait(driver,10);
		
		WebElement element = driver.findElement(By.partialLinkText("Login"));
		element.click();
	}
}
