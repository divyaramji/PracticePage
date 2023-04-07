package practicePage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Framework {
	WebDriver driver;

	public Framework(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	String state = "india";
	String fullname = "divyaramji";
	@FindBy(xpath = "//input[@value='radio2']")
	WebElement radio;
	@FindBy(id = "autocomplete")
	WebElement country;
	@FindBy(id = "dropdown-class-example")
	WebElement dropdown;
	@FindBy(id = "checkBoxOption2\"")
	WebElement checkBox;
	@FindBy(id = "name")
	WebElement name;
	@FindBy(id = "alertbtn")
	WebElement alert;

	@Test
	public void buttons() throws InterruptedException {
		radio.click();
	}

	@Test
	public void countryName(String state) {
		country.sendKeys(state);
		Select select = new Select(dropdown);
		select.selectByIndex(2);
	}

	@Test
	public void check(String fullname) {
		checkBox.click();
		name.sendKeys(fullname);
		alert.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		a.getText();
	}
}
