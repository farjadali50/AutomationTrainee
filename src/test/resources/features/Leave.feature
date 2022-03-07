Feature: Leave Page Test Cases
@Leave
Scenario Outline: Navigate to Employee Entitlements Page and add Employee Leave Entitlement
  Given user is on login page
  Then user enter username "<username>"
  Then user enter password "<password>"
  And click on sign in button
  Then verify user is successfully login
  Then user navigate to Leave Page
  Then user navigate to Add Entitlements Page
  Then user enter employee name "<employeeName>"
  Then user selects leave type "<leaveType>"
  Then user enter entitlement "<entitlement>"
  Then user presses save button

  Examples:
    | username         | password   | employeeName     | leaveType       | entitlement |
    | Admin            | admin123   | Jasmine Morgan        | CAN - Personal  | 125.00      |


  @Leave
  Scenario Outline: Navigate to Employee Entitlements Page and search Employee Leave Entitlements
    Given user is on login page
    Then user enter username "<username>"
    Then user enter password "<password>"
    And click on sign in button
    Then verify user is successfully login
    Then user navigate to Leave Page
    Then user navigate to Employee Entitlements Page
    Then user enter employee name "<employeeName>"
    Then user selects leave type "<leaveType>"
    Then user presses Search button
    Examples:
      | username         | password   | employeeName     | leaveType       |
      | Admin            | admin123   | Jasmine Morgan         | CAN - Personal  |

@Leave
Scenario Outline: Navigate to Assign Leave Page and Assign Leave to user
  Given user is on login page
  Then user enter username "<username>"
  Then user enter password "<password>"
  And click on sign in button
  Then verify user is successfully login
  Then user navigate to Leave Page
  Then user navigate to Apply Leave Page
  Then user enter Employee Name "<employeeName>"
  Then user selects Leave Type "<leaveType>"
  Then user selects From Date "<fromDate>"
  Then user selects To Date "<toDate>"
  Then user presses Assign button
  Examples:
    | username         | password   | employeeName   | leaveType       | fromDate     | toDate       |
    | Admin            | admin123   | Jasmine Morgan       | CAN - Personal  | 7 Mar 2022   | 8 Mar 2022   |


  @Leave
  Scenario Outline: Navigate to Leave List and Search a record
    Given user is on login page
    Then user enter username "<username>"
    Then user enter password "<password>"
    And click on sign in button
    Then verify user is successfully login
    Then user navigate to Leave Page
    Then user navigate to Leave List page
    Then user enters From Date "<fromDate>"
    Then user enters To Date "<toDate>"
    Then user selects All status checkbox
    Then user enters Employee name "<employeeName>"
    Then user clicks on Search Button
    Examples:
      | username         | password   | fromDate     | toDate       | employeeName |
      | Admin            | admin123   | 7 Mar 2022   | 8 Mar 2022   | Jasmine Morgan |


  @Leave
  Scenario Outline: Navigate to Leave Report Page and Generate Report
    Given user is on login page
    Then user enter username "<username>"
    Then user enter password "<password>"
    And click on sign in button
    Then verify user is successfully login
    Then user navigate to Leave Page
    Then user navigate to Leave Entitlements and Usage Report
    Then user selects Generate For "<generateFor>"
    Then user Enters Employee name "<employeeName>"
    Then user clicks View Button
    Examples:
      | username         | password   | generateFor  | employeeName  |
      | Admin            | admin123   | Employee     | Jasmine Morgan |