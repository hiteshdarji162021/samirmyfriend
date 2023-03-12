package PackageDemo.ProjectName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodsextra {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String getOsName = System.getProperty("os.name");
		System.out.println(getOsName);
		driver.navigate().refresh();

		


	}

}
