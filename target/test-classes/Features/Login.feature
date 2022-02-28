Feature: login page test case

  Scenario Outline: User login
    Then enter username "<username>"
    Then enter password "<password>"
    And click on sign in button

    Examples:
    | username  | password |
    | Admin     | admin123 |