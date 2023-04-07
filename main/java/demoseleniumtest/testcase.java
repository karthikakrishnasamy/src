package demoseleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium .webdriver;
import org.openqa .selenium.chrome.chromedriver;

public class testcase
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new chromeDriver();
        driver.get("http://www.bestbuy.com/");
        driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendkeys("sandbox=\"allow-scripts allow-same-origin\"");
        driver.findElement(By.className("no=js")).click();
        String at =driver.getTitle();
        String ed = "bestbuy";
        driver.close();
        if(at.equalsIgnoreCase(ed))
        {
        System.out.println("Test successful");
        }
        else 
        {
        	System.out.println("Test failure");
        }
        
	}

}
