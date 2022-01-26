package TestCases;

import org.openqa.selenium.WebDriver;

import Utilities.WebDriverManager;

public class LoadingUrl {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager objmanager= new WebDriverManager();
		driver = objmanager.launchBrowser();
		
		
		//Verification for title
		
		String title=driver.getTitle();		
		if(title.contains("Obsqura Testing"))
	    System.out.println("Testing Passed");
		else
	    System.out.println("Testing Failed");	
		
		
		
	//Verification for url
		
		String url=driver.getCurrentUrl();		
		if(url.contains("https://selenium.obsqurazone.com/index.php"))
	    System.out.println("Testing Passed");
		else
	    System.out.println("Testing Failed");	
		
		driver.close();
	}
}