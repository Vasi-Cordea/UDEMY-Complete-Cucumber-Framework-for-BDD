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

  @ignore
  Scenario: the user shuld not be able to login with bad credentials
    # Given the user in on the login page -background removed duplicated steps
    When the user enters bad credentials
    Then the user should not be able to login
    And the user should bet an invalid login message


  Scenario: the user should be ale to log in
    When user enters username as "student "
    And username enters password as "Password123"
    And user clicks on login
    Then the user should be able to view their account balance

  Scenario Outline: the user should be able to login
    When user enters "<username>" and "<password>"
    Then the user should be able to view their account balance

    Examples: 
      | username | password   |
      | student  | Password123 |
      | student  | passFail    |

  #using data table, parameterized to take a variable
  Scenario: after a failed attempt, the user should be able to login again
    When the user enters set of username and password
      | username     | password    |
      | unregStudent | failspass1  |
      | student      | Password123 |
    Then the user should be able to view their account balance
