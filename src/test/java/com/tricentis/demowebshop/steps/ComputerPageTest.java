package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageTest {
    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String text) {
        Assert.assertEquals(new ComputerPage().getPageTitleText(), text);
    }

    @When("I click on desktop link")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnSubMenu("Computer");
    }

    @Then("I should see the heading as {string}")
    public void iShouldSeeTheHeadingAs(String heading) {
        Assert.assertEquals(new DesktopsPage().getPageTitleText(), heading);

    }

    @And("I click on the product name Build your own computer")
    public void iClickOnTheProductNameBuildYourOwnComputer() {
        new DesktopsPage().selectProduct("Build your own computer");
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);

    }

    @And("I select RAM {string}")
    public void iSelectRAM(String RAM) {
        new BuildYourOwnComputerPage().selectRam(RAM);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String HDD) {
        new BuildYourOwnComputerPage().selectHDD(HDD);
    }

    @And("I select OS {string}")
    public void iSelectOS(String OS) {
        new BuildYourOwnComputerPage().selectOS(OS);
    }

    @And("I select Software {string}")
    public void iSelectSoftware(String Software) {
        new BuildYourOwnComputerPage().selectSoftware(Software);
    }

    @And("I click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @And("I should see the message {string}")
    public void iShouldSeeTheMessage(String message) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getProductAddedMessage(), message);
    }

    @Given("I click on computer tab")
    public void iClickOnComputerTab(String Computer) {
        new HomePage().clickOnMenuTab(Computer);
    }
}
