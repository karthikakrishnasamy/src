package staticdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class pomdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D://driver/chromedriver.exe");
		
				System.setProperty("webdriver.http.factory", "jdk-http-client");
				
				//create a new instance of the ChromeDriver
				WebDriver driver = new ChromeDriver();
				
				//open google.com
				driver.get("https://www.bustbuy.com/");
				driver.manage().window().maximize();
					
				//close the browser
				//driver.quit();

	}

}
