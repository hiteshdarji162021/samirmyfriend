package PackageDemo.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextGetAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		driver.manage().window().maximize();

		System.out.println(driver.findElement(By.id("p1")).getText());
		System.out.println(driver.findElement(By.id("p1")).getAttribute("innerHTML"));
		System.out.println(driver.findElement(By.id("p1")).getAttribute("textContent"));
		
		System.out.println(driver.findElement(By.id("p3")).getText());
		System.out.println(driver.findElement(By.id("p3")).getAttribute("innerHTML"));
		System.out.println(driver.findElement(By.id("p3")).getAttribute("textContent"));
	}

}
