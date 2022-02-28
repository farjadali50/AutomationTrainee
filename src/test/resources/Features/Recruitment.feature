Feature: Recruitment page test case

  @Recruitment
 Scenario Outline: Open Recruitment Page
    Then enter username "<username>"
    Then enter password "<password>"
    And click on sign in button
    Then verify user is successfully login
    Then click on Recruitment Button
    Then verify user is on Recruitment Page
   # Then Click on Add button
    Then select Jobtitle


    Examples:
      | username  | password |
      | Admin     | admin123 |

    Scenario Outline: Add new Candidate Record
      Then enter username "<username>"
      Then enter password "<password>"
      And click on sign in button
      Then verify user is successfully login
      Then click on Recruitment Button
      Then verify user is on Recruitment Page
      Then Click on Add button
      Then Add Basic Info "<firstname>","<middlename>","<lastname>","<email>","<contactno>"
      Then Select Job Vacancy
      Then Upload Resume
      Then Save candidate record


      Examples:
        | username  | password | firstname  | middlename  | lastname  | email             | contactno   |
        | Admin     | admin123 | farhan     | hassan      | naqvi    | test100@gmail.com | 03458457741 |




