package PackageDemo.ProjectName;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameProgram1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		int framesize = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(framesize);
		
		driver.switchTo().frame("singleframe");
		
		
 
	}

}
