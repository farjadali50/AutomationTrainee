Feature: Admin Pages Test Case


//@test
  Scenario Outline: Click on Admin Button
    Then user enter username "<username>"
    Then user enter password "<password>"
    And click on sign in button
    Then verify user is successfully login
    Then Click admin
    Examples:
      | username         | password   |
      | Admin            | admin123   |
