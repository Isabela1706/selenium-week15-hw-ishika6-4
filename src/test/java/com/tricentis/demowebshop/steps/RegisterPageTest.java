package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterPageTest {
    @Then("I should see the {string} text")
    public void iShouldSeeTheText(String registerText) {
        Assert.assertEquals(new RegisterPage().getRegisterText(), registerText);

    }

    @When("I click on Register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

//    @And("I should see first name error message {string}")
//    public void iShouldSeeFirstNameErrorMessage() {
//        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("First name"), "First name is required.");
//    }

//    @And("I should see last name error message {string}")
//    public void iShouldSeeLastNameErrorMessage(String lastName) {
//        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Last name"), lastName);
//
//    }

//    @And("I should see email error message {string}")
//    public void iShouldSeeEmailErrorMessage(String emailMessage) {
//        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Email"), emailMessage);
//    }

//    @And("I should see password error message {string}")
//    public void iShouldSeePasswordErrorMessage(String passwordMessage) {
//        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Password"), passwordMessage);
//    }

//    @Then("I should see confirm password error message {string}")
//    public void iShouldSeeConfirmPasswordErrorMessage(String confirmPassword) {
//        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Confirm Password"), confirmPassword);
//
//    }

    @When("I select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("I enter first name")
    public void iEnterFirstName() {
        new RegisterPage().enterFirstName("Alex");
    }

    @And("I enter last name")
    public void iEnterLastName() {
        new RegisterPage().enterLastName("Patel");
    }

    @And("I enter email")
    public void iEnterEmail() {
        new RegisterPage().enterEmail("alexpatel4565@gmail.com");
    }

    @And("I enter password")
    public void iEnterPassword() {
        new RegisterPage().enterPassword("patelalex");
    }

    @And("I enter confirm password")
    public void iEnterConfirmPassword() {
        new RegisterPage().enterConfirmPassword("patelalex");
    }


    @When("I should see register message {string}")
    public void iShouldSeeRegisterMessage(String registerMessage) {
        Assert.assertEquals(new RegisterPage().getYourRegCompletedText(), registerMessage);
    }

    @Given("I click on Register Link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("I should see first name error message First name is required.")
    public void iShouldSeeFirstNameErrorMessageFirstNameIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("First name"), "First name is required.");
    }

    @And("I should see last name error message Last name is required.")
    public void iShouldSeeLastNameErrorMessageLastNameIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Last name"), "Last name is required.");
    }

    @And("I should see email error message Email is required.")
    public void iShouldSeeEmailErrorMessageEmailIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Email"), "Email is required.");

    }

    @And("I should see password error message Password is required.")
    public void iShouldSeePasswordErrorMessagePasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Password"), "Password is required.");

    }

    @Then("I should see confirm password error message Password is required.")
    public void iShouldSeeConfirmPasswordErrorMessagePasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Confirm Password"), "Password is required.");
    }
}
