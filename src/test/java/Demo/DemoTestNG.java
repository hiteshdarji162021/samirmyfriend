package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG {

	@Test(priority = 1)
	public void openbrowser() {

		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		String ExpectedTitle= "Register";
		Assert.assertEquals(title,ExpectedTitle);
		Assert.assertTrue(title.contains(ExpectedTitle));
		System.out.println("Title is matched samir user");
		System.out.println("My Name is khan");
		
	}

}
