package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {
	
	public void main(String[] arg) {
	
	WebDriver driver = new ChromeDriver();

	driver.get("www.topmaison.pl");
	
	driver.close();
	
	}
}
