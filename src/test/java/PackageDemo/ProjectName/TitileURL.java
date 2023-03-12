package PackageDemo.ProjectName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitileURL {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	   System.out.println(driver.getCurrentUrl());

	}

}
