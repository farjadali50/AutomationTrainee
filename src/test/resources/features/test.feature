Feature: Dashboard test case
  Scenario Outline : check that email field is visible
    Then user enter username "<username>"
    Then user enter password "<password>"
    And click signing button

    Examples:
      | username | password |
      | Admin    | admin123 |
