package Pageobjects;

 

	import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;

	public class basepage {
		
		public static WebDriver driver = null;
		
		@BeforeSuite
		public void initialize() throws IOException{
				
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\pushm\\eclipse-workspace\\Dsalgo1\\src\\test\\resources\\drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();		
			//To maximize browser
	                driver.manage().window().maximize();
		        //Implicit wait
	        	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//To open facebook
	                driver.get("https://dsportalapp.herokuapp.com/");
			
		}
		
		/*@AfterAll
		//Test cleanup
		public static void TeardownTest()
	    {
	       basepage.driver.quit();
	    }

		public static void main(String[] args) {
			TeardownTest();
		}*/
	}	
	

