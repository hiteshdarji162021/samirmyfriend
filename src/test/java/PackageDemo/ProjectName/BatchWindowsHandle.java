package PackageDemo.ProjectName;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BatchWindowsHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> childs = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		for (String handle : childs) {
			if (!parent.equals(handle)) {
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("Hitesh");
				driver.switchTo().window(parent);
			}
		}

	}

}
