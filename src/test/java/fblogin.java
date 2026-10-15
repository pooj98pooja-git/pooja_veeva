import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class fblogin {
public static void main(String[]args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();//maximize the window
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();//current window close
//	driver.quit();// entire window will close
	
	
}
}
