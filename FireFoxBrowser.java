package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.dockerjava.api.model.Driver;

public class FireFoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Edge Browser Instead of Firefox 		
				WebDriver driver = new FirefoxDriver();
				
				//Maximizing the window 
				driver.manage().window().maximize(); 
				
				//Navigating the URL
				driver.navigate().to("https://www.google.com/"); 
				
				//Using getCurrentUrl() method to get the URL
				String url= driver.getCurrentUrl();            
				
				//Printing the URL
				System.out.println("The Webpage Loaded from:");   
				System.out.println(url);
				
				//Reloading the page
				driver.navigate().refresh();                               
				
				//Closing the driver
				driver.close();                   
	}

}
