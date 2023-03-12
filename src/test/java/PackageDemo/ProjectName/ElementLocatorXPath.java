package PackageDemo.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocatorXPath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("username")).sendKeys("student");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("student");
		driver.findElement(By.xpath("//*[@type='text']"));
		driver.findElement(By.xpath("//input[@name='username' and @id='username']"));
		driver.findElement(By.xpath("//input[@name='username'][@id='username']"));
		driver.findElement(By.xpath("//input[@name='username' or @id='username']"));
		driver.findElement(By.xpath("//input[contains(@id,'user')]"));
		driver.findElement(By.xpath("//input[starts-with(@name,'user')]"));
		driver.findElement(By.xpath("//*[text()='Contact']"));
		driver.findElement(By.xpath("//*[text()='Username']/following ::input[1]"));
		driver.findElement(By.xpath("//*[text()='Username']/following ::input[@id='username']"));
		driver.findElement(By.xpath("//*[text()='Username']/following-sibling ::  input"));
		driver.findElement(By.xpath("//*[text()='Password']/preceding ::  input"));
		driver.findElement(By.xpath("//input[@name='password']/preceding-sibling :: label"));
		driver.findElement(By.xpath("//input[@name='password']/ancestor :: div"));
	}

}
