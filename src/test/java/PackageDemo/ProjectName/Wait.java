package PackageDemo.ProjectName;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//System.out.println(driver.getTitle()); 
		
		String getOsName = System.getProperty("os.name");
		System.out.println(getOsName);
		driver.navigate().refresh();

	}

}
