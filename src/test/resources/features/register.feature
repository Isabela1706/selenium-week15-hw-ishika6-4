

Feature: Register Feature
  In order to perform successful register
  As a User
  I have to enter name and password in field



  Scenario: User should navigate to Register page successfully
    Given I click on Register Link
    Then I should see the "Register" text



  Scenario: User should click on register button with empty field
    Given I click on Register Link
    When I click on Register button
    And I should see first name error message First name is required.
    And I should see last name error message Last name is required.
    And I should see email error message Email is required.
    And I should see password error message Password is required.
    Then I should see confirm password error message Password is required.



      Scenario: User should create account successfully
        Given I click on Register Link
        When I select gender "Female"
        And I enter first name
        And I enter last name
        And I enter email
        And I enter password
        And I enter confirm password
        And I click on Register button
        When I should see register message "Your registration completed"
