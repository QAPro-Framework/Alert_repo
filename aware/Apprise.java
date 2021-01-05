package aware;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Apprise {

	public static void main(String[] args) {
 System.setProperty("webdriver.gecko.driver", "C://Users//EMTI//eclipse-workspace//Demo_alert_handle//DRIVER//geckodriver.exe");
 //System.setProperty("webdriver.chrome.driver", "C://Users//EMTI//eclipse-workspace//Demo_alert_handle//DRIVER//chromedriver.exe");	
	WebDriver driver = new FirefoxDriver();	
	//WebDriver driver = new ChromeDriver();
	driver.get("");	
		
		
		// TODO Auto-generated method stub

	}

}
