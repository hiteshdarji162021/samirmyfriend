package PackageDemo.ProjectName;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		WebElement drp = driver.findElement(By.xpath("//*[@id='yearbox']"));

		Select st = new Select(drp);
		
		st.selectByIndex(1);
		
		//WebElement eeeee= st.getFirstSelectedOption();
		
		
		//st.selectByValue("C");
		

		List<WebElement> ele = st.getOptions();

		for (WebElement eee : ele) {

			System.out.println(eee.getText());
			
			String test = eee.getText();
			
			if(test.equalsIgnoreCase("1944")) {
				st.selectByValue(eee.getText());
			}

		}

	}

}
