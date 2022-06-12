package seleniumscripts;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part03Browsers
{
	public static void main(String args[]) throws InterruptedException
	{
	
	//	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();	
		WebDriver c = new ChromeDriver();
		Thread.sleep(3000);
		
	//	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
	
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver f = new FirefoxDriver();
		Thread.sleep(3000);
		
	//	System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//msedgedriver.exe");
	
		WebDriverManager.edgedriver().setup();
		EdgeDriver e=new EdgeDriver();
		Thread.sleep(3000);
		
		c.quit();
		f.quit();
		e.quit();

	}
}
