Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password


  Background: I am on homepage



  Scenario: User should navigate to login page successfully
    When I click on login link
    Then I should navigate to login page successfully


    @smoke
  Scenario: User should verify the error message with in valid credentials
    When I click on login link
    And I enter email id "alexjain7675@gmail.com"
    And I enter password "alexj354"
    And I click on login button
    Then I should see the error message "Login was unsuccessful. Please correct the errors and try again./n No customer account found"


      @sanity
  Scenario: User should login successfully with in valid credentials
    When I click on login link
    And I enter email id "alexpatel123@gmail.com"
    And I enter password "alex123"
    And I click on login button
    Then I should see the log out link is displayed


  Scenario: User should logout successfully
    When I click on login link
    And I enter email id "alexpatel123@gmail.com"
    And I enter password "alex123"
    And I click on login button
    And I click on logout link
    Then I should see the log out link is displayed









