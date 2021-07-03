Feature: Register new user web table

  @regression
  Scenario: Register Successful
    Given That a web user i want to register in the web page
    When fill all the requested fields in the web table
    Then we can see the form with our information