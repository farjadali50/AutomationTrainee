Feature: Login Page Test Case

  Scenario Outline: Login with valid credential
    Then user enter username "<username>"
    Then user enter password "<password>"
    And click on sign in button

    Examples:
    | username         | password   |
    | Admin            | admin123   |