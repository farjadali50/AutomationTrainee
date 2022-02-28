Feature: login page test case
@login
  Scenario Outline: User login
    Then enter username "<username>"
    Then enter password "<password>"
    And click on sign in button
    Then verify user is successfully login

    Examples:
    | username  | password |
    | Admin     | admin123 |