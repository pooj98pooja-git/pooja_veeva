import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jarcls {
	public static void main (String[]args)
	{
//		System.out.println(System.getProperty("java.version"));
		System.setProperty("webdriver.edge.driver", "C:\\Users\\pooja\\eclipse-workspace\\Mavenproject\\target\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com/");

//        System.setProperty("webdriver.edge.driver", "C:\\Users\\pooja\\eclipse-workspace\\SeleniumCreation\\Target\\msedgedriver.exe");
//		WebDriverManager.chromedriver().setup();
//	    WebDriver driver = new ChromeDriver();
//	    driver.get("https://www.oracle.com/");
	    
	}
	} 