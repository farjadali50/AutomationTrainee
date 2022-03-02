Feature: Login Page Test Case

#  Scenario Outline: Login with invalid credential
#    Then user enter username "<username>"
#    Then user enter password "<password>"
#    And click on sign in button
#    Then verify user is not successfully login
#
#    Examples:
#    | username         | password   |
#    | Admin            | admin      |

  Scenario Outline: Login with valid credential
    Then user enter username "<username>"
    Then user enter password "<password>"
    And click on sign in button
    Then verify user is successfully login

    Examples:
      | username         | password   |
      | Admin            | admin123   |