package Driverfactory;

 	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;

	import io.cucumber.java.Scenario;
	import io.github.bonigarcia.wdm.WebDriverManager;
	 

	public class Driverfactory {

		public static WebDriver driver;

		public WebDriver initializeDrivers(String browser) {

			if (browser.equalsIgnoreCase("firefox")) {
				 System.out.println("Testing on firefox");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			} else if (browser.equalsIgnoreCase("chrome")) {
				 System.out.println("Testing on chrome");
				WebDriverManager.chromedriver().browserVersion("108.0.0").setup();
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("safari")) {
				 System.out.println("Testing on safari");
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();

			} else if (browser.equalsIgnoreCase("edge")) {
				 System.out.println("Testing on Edge");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			}
			// Set Page load timeout
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

			driver.manage().window().maximize();

			return driver;
		}

		public static WebDriver getdriver() {
			return driver;

		}

		public void closeallDriver() {
			driver.close();
		}

	
	}
	

