package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

@DefaultUrl("https://www.demoqa.com/webtables")
public class RegisterUserWebTablePage extends PageObject {

    public By addNewRecordButton = By.id("addNewRecordButton");
    public By firstNameInput = By.id("firstName");
    public By lastNameInput = By.id("lastName");
    public By userEmailInput = By.id("userEmail");
    public By ageInput = By.id("age");
    public By salaryInput = By.id("salary");
    public By departmentInput = By.id("department");
    public By submitButton = By.id("submit");
    public By userEmailValidation = By.xpath("//*[@class='rt-tbody']/div[4]/div/div[4]");
            //"//*[@class='rt-td' and text()='"+userEmailInput+"']");



    public void clickAddNewRecordButton (){

        getDriver().findElement(addNewRecordButton).click();
    }
    public void sendFirstNameInput (String string){
        getDriver().findElement(firstNameInput).sendKeys(string);
    }
    public void sendLastNameInput (String string){

        getDriver().findElement(lastNameInput).sendKeys(string);
    }
    public void sendUserEmailInput (String string){

        getDriver().findElement(userEmailInput).sendKeys(string);
    }
    public void senAgeInput (String string){

        getDriver().findElement(ageInput).sendKeys(string);
    }
    public void sendDepartmentInput (String string){

        getDriver().findElement(departmentInput).sendKeys(string);
    }
    public void sendSalaryInput (String string){

        getDriver().findElement(salaryInput).sendKeys(string);
    }
    public void addNewRecordButton () {
        getDriver().findElement(firstNameInput).click();
    }
    public void clickSubmitButton (){
        getDriver().findElement(submitButton).click();
    }

    public void validation(String expectedEmail){
        assertEquals(getDriver().findElement(userEmailValidation).getText(), expectedEmail);
    }

}
