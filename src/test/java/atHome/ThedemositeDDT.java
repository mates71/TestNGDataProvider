package atHome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ThedemositeDDT {
	 /**
	  * Create a DataProvider that creates Credentials
	  * Add multiple test credentials
	  * Create a test that accepts credentials from DataProvider 
	  * Use Selenium to navigate to 	http://thedemosite.co.uk/addauser.php
	  * And 
	  */
		WebDriver driver;
		@BeforeTest
		public void openDemoSite(){
			System.setProperty("webdriver.chrome.driver",
					"/Users/musaates/Documents/Libraries/drivers/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.get("	http://thedemosite.co.uk/addauser.php");
		}
		
		@Test(dataProvider="Credentials")
		public void demoSiteCoUkDDT(String userName,String password){
			 driver.findElement(By.name("username")).sendKeys(userName);
			 driver.findElement(By.name("password")).sendKeys(password);
			 driver.findElement(By.name("FormsButton2")).click();
		}
		
	 /* @Test(dataProvider="Credentials")
	  public void demoSiteCoUkDDT(String userName,String password) {
		  driver.findElement(By.name("username")).sendKeys(userName);
		  password=password.substring(0,8);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.name("FormsButton2")).click();*/
		  
		  /**
		   * Assert that The username: username
						 The password: password
			Click On Login and try to login using credentials that u added 
			assert 	
		   */

	  //}
	  
	  @DataProvider(name="Credentials")
	  public Object[][] generateCredentials(){
		  Object[][] employees=new Object[3][2];
		  employees[0][0]="Alim";
		  employees[0][1]="Ali@gmail.com";
		  
		  employees[1][0]="velim";
		  employees[1][1]="veli@gmail.com";
		  
		  employees[2][0]="hanim";
		  employees[2][1]="han@gmail.com";
		
		  
		  return employees;
	  }
	  

}
