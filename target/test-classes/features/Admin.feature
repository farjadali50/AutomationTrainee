Feature: User Test Case



  Scenario Outline: Add new User
    Given user is on login page
    Then user enter username "<username>"
    Then user enter password "<password>"
    And click on sign in button
    Then verify user is successfully login
    Then  move to user page




    Examples:
      |username  | password|
      |Admin      |admin123|