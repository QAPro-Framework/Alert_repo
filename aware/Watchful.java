package aware;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


    public class Watchful {

	public static void main(String[] args) {
 System.setProperty("webdriver.gecko.driver", "C://Users//EMTI//eclipse-workspace//Demo_alert_handle//DRIVER//geckodriver.exe");
 // System.setProperty("webdriver.chrome.driver", "C://Users//EMTI//eclipse-workspace//Demo_alert_handle//DRIVER//chromedriver.exe");	
	WebDriver driver = new FirefoxDriver();	
	//WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php ");
	
	//Provide password text box using xPath & cssSelector
	//driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("53920");
	//driver.findElement(By.cssSelector("body > form:nth-child(7) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > input:nth-child(1)")).sendKeys("53920");;
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("53920");
driver.findElement(By.cssSelector("[type='text']")).sendKeys("53920");//Custom cssSelector without tag
	
     //Click on submit using xPath & cssSelector
	//driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
	//driver.findElement(By.cssSelector("body > form:nth-child(7) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > input:nth-child(1)")).click();
 driver.findElement(By.cssSelector("input[type='submit']")).click(); //Custom cssSelector With tag
 
		//handle simple alert using Alert interface 
	Alert aobj = driver.switchTo().alert();
	String alert_text = aobj.getText();
	System.out.println("The alert text is :"+alert_text);
    aobj.accept();// accept the alert 
	//aobj.dismiss();//cancel the alert
	
	
	// TODO Auto-generated method stub

	}

}

