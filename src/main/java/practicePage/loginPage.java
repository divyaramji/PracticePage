package practicePage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class loginPage {
	WebDriver driver;

	public loginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@BeforeTest
	public void login(String url) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\user\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

}
