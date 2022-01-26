package TestNgtestcases;

import org.testng.annotations.Test;

import Utilities.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class InitialTestCases {
	
	static WebDriver driver;
		
  @Test(priority=1)   //testcase priority
  public void titleVerification() {
	  String title=driver.getTitle();		
		if(title.contains("Obsqura Testing"))
	    System.out.println("Testing Passed");
		else
	    System.out.println("Testing Failed");	
		
  }
  
  @Test(priority=2)    
  public void urlVerification() {
	  String url=driver.getCurrentUrl();		
		if(url.contains("https://selenium.obsqurazone.com/index.php"))
	    System.out.println("Testing Passed");
		else
	    System.out.println("Testing Failed");
		
  }
   
  @BeforeTest //execute onetime
  public void beforeTest() throws InterruptedException {
	  WebDriverManager objmanager= new WebDriverManager();
		driver = objmanager.launchBrowser();
  } 
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
