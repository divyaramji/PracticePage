
Feature: I landed on Ecommerce Page
 

  Scenario Outline: Automation Practice
    Given User login succesfully and is on Home Page
    When clicks on "Radio2" in WebPage
    And I sendkeys in countries "<state>"
    And I select the dropdown using "byindex(2)"
    And I select the checkbox "Option2"
    And I Enter my name in "<name>", after I clicks on "alertbtn"
    And "accept" the message
    Then I check in how many links are available in webpage
   Examples:
      | name  		 |				state		|
      | divyaramji |				india		|
