package Pageobjects;

 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class Homepages  {
		
		        // WebDriver driver; 

		         public Homepages (WebDriver driver)
		   	  {
		   	   PageFactory.initElements(driver, this);
		   	  }        
		         
	       /* public Homepage(WebDriver driver){ 
	                this.driver=driver; 
	        }*/
	       @FindBy (xpath="//div[@class='content']/a/button")
			public WebElement Getstarted;
	        
	        public void getStarted() {
	        	Getstarted.click();
	        }
			 
	     
	        
		
		 

	}
	
	
	

