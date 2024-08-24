Feature: feature to test HRM application

      Background:
        Given user is on Orange HRM application "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

        @Regression
        @ValidCredentials
      Scenario: Login with valid credentials
        When user enters username as "Admin" and password as "admin123"
        Then user should be able to login successfully and Home page is open

        @Regression
        @InvalidCredentials
        Scenario Outline: Login with Invalid credentials
          When user enters username as "<username>" and password as "<password>"
          Then user should be able to see the error Message "<errorMessage>"

          Examples:
            | username  | password | errorMessage |
            | Admin123 | admin123$ | Invalid credentials |