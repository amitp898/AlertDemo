Feature: Register User with existing email

  Scenario: user will be in home page
    Given i am navigate to application
    And i should be in homepage
    When i have click signup button
    Then title should be display

    Scenario Outline: user will get error message with existing credential
      Given  i have entered the "<name>" and "<email>"
      When I click on the signup button
      Then I should see an error message indicating "<error message>"

      Examples:

        | name         | email                    | error message                |
        | Amit Patnaik | amitpatnaik008@gmail.com | Email Address already exist! |


