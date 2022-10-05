package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asha\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	   
 // Instantiate a ChromeDriver class.     
      WebDriver driver=new ChromeDriver();  
        
       
      driver.navigate().to("http://www.javatpoint.com/");  
        
       //Maximize the browser  
        driver.manage().window().maximize();  
        driver.close();
	}
}
