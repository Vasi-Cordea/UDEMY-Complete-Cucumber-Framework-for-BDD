@endtoend
Feature: The Login Page
  As a returning customer
  I want to login to the application
  So that I can view my account balance

Background:
Given the user is on the login page

@goodlogin
  Scenario: the user should be able to login with valid credentials
    #Given the user is on the login page -background removed duplicated steps
    When the user enters valid credentials
    Then the user should be able to view their account balance

  Scenario: the user shuld not be able to login with bad credentials
   # Given the user in on the login page -background removed duplicated steps
    When the user enters bad credentials
    Then the user should not be able to login
    And the user should bet an invalid login message