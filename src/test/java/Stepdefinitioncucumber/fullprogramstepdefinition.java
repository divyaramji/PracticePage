package Stepdefinitioncucumber;

//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fullprogramstepdefinition {

	@Given("^User login succesfully and is on Home Page$")
	public void user_login_succesfully_and_is_on_Home_Page() throws Throwable {
		System.out.println("User login succesfully and is on Home Page");
		}

	@When("^clicks on \"([^\"]*)\" in WebPage$")
	public void clicks_on_in_WebPage(String arg1) throws Throwable {
		System.out.println("clicks on Radio2 in WebPage");
		}

	@When("^I sendkeys in countries \"([^\"]*)\"$")
	public void i_sendkeys_in_countries(String arg1) throws Throwable {
		System.out.println(" I sendkeys in countries india");
		}

	@When("^I select the dropdown using \"([^\"]*)\"$")
	public void i_select_the_dropdown_using(String arg1) throws Throwable {
		System.out.println(" I select the dropdown using byindex(2)");
		}

	@When("^I select the checkbox \"([^\"]*)\"$")
	public void i_select_the_checkbox(String arg1) throws Throwable {
		System.out.println("I select the checkbox Option2");
		}

	@When("^I Enter my name in \"([^\"]*)\", after I clicks on \"([^\"]*)\"$")
	public void i_Enter_my_name_in_after_I_clicks_on(String arg1, String arg2) throws Throwable {
		System.out.println("I Enter my name in divyaramji, after I clicks on alertbtn");
		}

	@When("^\"([^\"]*)\" the message$")
	public void the_message(String arg1) throws Throwable {
		System.out.println("accept the message");
		}

	@Then("^I check in how many links are available in webpage$")
	public void i_check_in_how_many_links_are_available_in_webpage() throws Throwable {
		System.out.println("I check in how many links are available in webpage");
		}
}