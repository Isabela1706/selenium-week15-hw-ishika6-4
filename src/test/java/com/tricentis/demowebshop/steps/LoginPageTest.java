package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageTest {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @And("I enter email id {string}")
    public void iEnterEmailId(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message {string} + No customer account found\"")
    public void iShouldSeeTheErrorMessageNoCustomerAccountFound(String errorMessage) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}


    }

    @Then("I should see the log out link is displayed")
    public void iShouldSeeTheLogOutLinkIsDisplayed() {
        Assert.assertTrue(new HomePage().isLogOutLinkDisplay(), "Logout link is not displayed");

    }

    @And("I click on logout link")
    public void iClickOnLogoutLink() {
        new HomePage().clickOnLogOutLink();
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) throws Throwable{
    Assert.assertEquals(new LoginPage().getErrorMessage(), errorMessage);
    }
}
