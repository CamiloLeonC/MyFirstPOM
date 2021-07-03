package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.RegisterUserWebTablePage;
import com.demoqa.automation.utils.JavaScript;
import com.demoqa.automation.utils.Times;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class RegisterUserWebTableSteps {
    RegisterUserWebTablePage registerUserWebTablePage = new RegisterUserWebTablePage();
    DataInjection dataInjection = new DataInjection();

    @Step
    public void openBrowser(){
        registerUserWebTablePage.open();
    }

    @Step
    public void fillAllFieldsWebTable() throws InterruptedException {
        registerUserWebTablePage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Times.waitFor(2000);
        JavaScript.clickJS(registerUserWebTablePage.getDriver(), registerUserWebTablePage.addNewRecordButton);
        registerUserWebTablePage.sendFirstNameInput(dataInjection.getFirstName());
        registerUserWebTablePage.sendLastNameInput(dataInjection.getLastName());
        registerUserWebTablePage.sendUserEmailInput(dataInjection.getEmail());
        registerUserWebTablePage.senAgeInput(dataInjection.getAge());
        registerUserWebTablePage.sendSalaryInput(dataInjection.getSalary());
        registerUserWebTablePage.sendDepartmentInput(dataInjection.getDepartment());
        Times.waitFor(2000);
        JavaScript.clickJS(registerUserWebTablePage.getDriver(), registerUserWebTablePage.submitButton);

    }

    @Step
    public void validationRegisterUserWebTablePage() throws InterruptedException{
        Times.waitFor(1000);
        registerUserWebTablePage.validation(dataInjection.getextesionEmail()+dataInjection.getEmail());
    }
}
