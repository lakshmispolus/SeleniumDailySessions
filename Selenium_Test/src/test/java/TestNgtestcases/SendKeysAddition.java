package TestNgtestcases;

import org.testng.annotations.Test;

import Utilities.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SendKeysAddition {
	static WebDriver driver;
  
	@Test
  public void sendKeys() throws InterruptedException {
	 
	  Thread.sleep(1000);
	  WebElement inputform =driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
      inputform.click();
      Thread.sleep(1000);
      
      String mytextvalue="Test";
      WebElement enterMessage =driver.findElement(By.id("single-input-field"));
      enterMessage.sendKeys(mytextvalue);
      Thread.sleep(2000);
      
      WebElement clickShowMessagebn =driver.findElement(By.id("button-one"));
      clickShowMessagebn.click();
      Thread.sleep(2000);
      
      WebElement clicktext =driver.findElement(By.id("message-one"));
      String textvalue = clicktext.getText();   
      
      if(textvalue.contains(mytextvalue))
    	  Assert.assertTrue(true, "Text value matches");
      else
    	  Assert.assertTrue(false, "Text value not matches");
    	  
   
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager objmanager= new WebDriverManager();
		 driver = objmanager.launchBrowser();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
