package fullProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import practicePage.loginPage;

public class fullprogram {
	WebDriver driver;

	@Test

	public void selectionTest() throws Exception {
		String state = "india";
		String name = "divyaramji";
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		driver.findElement(By.id("autocomplete")).sendKeys(state);
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByIndex(2);
		driver.findElement(By.id("checkBoxOption2")).click();
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		List<WebElement> url = driver.findElements(By.tagName("a"));
		System.out.println(url.size());
	}

}
