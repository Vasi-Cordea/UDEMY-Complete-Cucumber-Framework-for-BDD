@ignore
Feature: Tthe user should be able to see thei account information

  Background: 
    Given the user opens a browser
    Given the user navigates to the login page
    Given the user enters valid credentials

  Scenario: the user should be able to make a payment
  Given the user clicks on make payment
  And the user enters credit card information
  And the user should see a confirmation message

  Scenario: the user should be able to change their password
