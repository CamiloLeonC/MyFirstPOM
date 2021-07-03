package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.steps.RegisterUserWebTableSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterUserWebTablesStepDefinition {

    @Steps
    RegisterUserWebTableSteps registerUserWebTableSteps;

    @Given("^That a web user i want to register in the web page$")
    public void thatAWebUserIWantToRegisterInTheWebPage() {
        registerUserWebTableSteps.openBrowser();
    }


    @When("^fill all the requested fields in the web table$")
    public void fillAllTheRequestedFieldsInTheWebTable() throws InterruptedException {
        registerUserWebTableSteps.fillAllFieldsWebTable();
    }

    @Then("^we can see the form with our information$")
    public void weCanSeeTheFormWithOurInformation() throws InterruptedException {
        registerUserWebTableSteps.validationRegisterUserWebTablePage();

    }


}
