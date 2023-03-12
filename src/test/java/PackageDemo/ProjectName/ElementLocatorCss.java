package PackageDemo.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocatorCss {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#username")).sendKeys("abc");
		driver.findElement(By.cssSelector("button.btn")).click();
		driver.findElement(By.cssSelector("input[name='username']"));
		driver.findElement(By.cssSelector("input[name='username'][id='username']"));
		driver.findElement(By.cssSelector("input[name*=user]"));
		driver.findElement(By.cssSelector("input[name^=user]"));
		driver.findElement(By.cssSelector("input[name$=name]"));
		
		

	}

}
