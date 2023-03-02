Feature: Amazon Invalid LogIn

  Background: 
    Given To launch url

  Scenario: To validate login functionalities with valid username and invalid password and check error message
    When To click signIn button
    And To enter valid mailID
    And To click continue button
    And To enter invalid password
    And To click signIn
    And To check the error message
    Then To take screenshot2

  Scenario: To validate login functionalities with invalid username and check error message
    When To click signIn button
    And To enter invalid mailID
    And To click continue button
    Then To take screenshot3
    And To check the error message with assertion
    And To click signIn
