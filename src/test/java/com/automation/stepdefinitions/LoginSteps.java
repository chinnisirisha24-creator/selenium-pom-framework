package com.automation.stepdefinitions;
import org.testng.Assert;
import com.automation.hooks.Hooks;
import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {
	LoginPage _loginPage;
	
 @Given("the user is on the login page")
 public void user_is_on_login_page()
 {
	 Hooks.driver.get("https://the-internet.herokuapp.com/login");
	 _loginPage = new LoginPage(Hooks.driver);
 }
 
 @When("the user enters username {string}")
 public void user_enters_username(String username)
 {
	 _loginPage.enterUsername(username);
 }
 
 @When("the user enters password {string}")
 public void user_enters_password(String password)
 {
	 _loginPage.enterPassword(password);
 }
 
 @When("the user clicks the login button")
 public void user_clicks_login_button()
 {
	 _loginPage.clickLoginButton();
 }
 
 @Then("the user should see the message {string}")
 public void user_should_see_message(String expectedMessage)
 {
	 String actualMessage = _loginPage.getMessage();
	 Assert.assertTrue(actualMessage.contains(expectedMessage), "Expected message was not displayed. Actual " +actualMessage);
 }
 
 @Then("the login result should be {string}")
 public void verify_login_result(String expectedMessage)
 {
	 String actualMessage = _loginPage.getMessage();
	 Assert.assertTrue(actualMessage.contains(expectedMessage), "Expected: "+expectedMessage + "Actual: "+ actualMessage);
//	 if(result.equalsIgnoreCase("sucess"))
//	 {
//		 Assert.assertTrue(actualMessage.contains("You logged into a secure area"));
//		 
//	 }
//	 else if(result.equalsIgnoreCase("failure"))
//	 {
//		 Assert.assertTrue(actualMessage.contains("Your username is invalid!"));
//	 }
//	 
//	 else if(result.equalsIgnoreCase("failure"))
//	 {
//		 Assert.assertTrue(actualMessage.contains("Your password is invalid!"));
//	 }
 }
 
 }

