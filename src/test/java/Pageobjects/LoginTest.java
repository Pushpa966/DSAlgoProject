package Pageobjects;

 
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;

	 
	public class LoginTest extends basepage{
		 
		 

		//public LoginTest(WebDriver driver) {
			// basepage.driver=driver;  
		//}
		
		
	 
		 
		public void loginmethod() {
			
			    
			Homepages homepage = PageFactory.initElements(driver, Homepages.class);
			homepage.getStarted();
			 
		 
		 
				Login login = PageFactory.initElements(driver, Login.class);
				
				login.setusername("starninja");
				login.setPassword("Welcome@11");
				login.clickOnLoginButton();
				
				
			}

		public void clickSignoutButton() {
			// TODO Auto-generated method stub
			driver.close();
		}
		
	
	}
		
