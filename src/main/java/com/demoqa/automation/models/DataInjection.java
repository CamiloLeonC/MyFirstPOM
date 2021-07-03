package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String firstName, lastName, email, age, salary, department, extesionEmail;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    public String getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getextesionEmail() {
        return extesionEmail;
    }

    public  DataInjection(){
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.age = Integer.toString(faker.number().numberBetween(17,80));
        this.salary = Integer.toString(faker.number().numberBetween(800000,15000000));
        this.department = faker.job().title();
        this.extesionEmail = "";
    }
}
