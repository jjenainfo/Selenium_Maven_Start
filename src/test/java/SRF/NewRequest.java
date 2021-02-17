package SRF;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewRequest  {
	WebDriver driver;
  @Test
  public void SingleInputField() {
	  
	  driver.findElement(By.id("user-message")).sendKeys("abcd");
	  driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
	  Assert.assertEquals("abcd", "abcd");
	  System.out.println("assrted");
	
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
