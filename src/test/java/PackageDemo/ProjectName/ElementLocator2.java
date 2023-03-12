package PackageDemo.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocator2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//Element located by linktext
		driver.findElement(By.linkText("New to Flipkart? Create an account")).click();
		driver.navigate().back();
		driver.navigate().forward();
		//Element located by Partial linktext
		driver.findElement(By.partialLinkText("New to Flipkart?"));
		driver.findElement(By.xpath("//*[text()='✕']")).click();
		//Element located by tag Name
		System.out.println(driver.findElements(By.tagName("a")).size());

	}

}
