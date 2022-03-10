Feature: Recruitment page test case

  @Recruitment
 Scenario Outline: Open Recruitment Page
    Then enter username "<username>"
    Then enter password "<password>"
    And click on sign in button
    Then verify user is successfully login
    Then click on Recruitment Button
    Then verify user is on Recruitment Page
    Then Click on Add button
    #Then select Jobtitle "<title>"
    Then logout Application


    Examples:
      | username  | password |  title |
      | Admin     | admin123 |  Automation Tester |

  @Recruitment
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
      Then logout Application

      Examples:
        | username  | password | firstname  | middlename  | lastname  | email             | contactno   |
        | Admin     | admin123 | farhan    | hassan      | naqvi    | test100@gmail.com | 03458457741 |


  @Recruitment
      Scenario Outline: Select and Change Candidate Application Request Status
        Then enter username "<username>"
        Then enter password "<password>"
        And click on sign in button
        Then verify user is successfully login
        Then click on Recruitment Button
        Then verify user is on Recruitment Page
        Then Search Candidate By Name "<firstname>","<middlename>","<lastname>"
        Then click on Search Button
        Then select record from grid
        Then change application status "<status>"
        Then click on shortlist button
        Then logout Application

        Examples:
          | username  | password | firstname  | middlename  | lastname  | status    |
          | Admin     | admin123 | farhan     | hassan      | naqvi     | Shortlist |


     @Recruitment
      Scenario Outline: Edit Candidate Application
          Then enter username "<username>"
          Then enter password "<password>"
          And click on sign in button
          Then verify user is successfully login
          Then click on Recruitment Button
          Then verify user is on Recruitment Page
          Then Search Candidate By Name "<firstname>","<middlename>","<lastname>"
          Then click on Search Button
          Then select record from grid
          Then click on edit button
          Then edit the record
          Then click on save button
          Then logout Application

          Examples:
            | username  | password | firstname  | middlename  | lastname  |
            | Admin     | admin123 | farhan     | hassan      | naqvi     |

  @Recruitment
  Scenario Outline: Delete Candidate Record

    Then enter username "<username>"
    Then enter password "<password>"
    And click on sign in button
    Then verify user is successfully login
    Then click on Recruitment Button
    Then verify user is on Recruitment Page
    Then Search Candidate By Name "<firstname>","<middlename>","<lastname>"
    Then click on Search Button
    Then select record to delete
    Then click on delete button
    Then click on Ok button on delete Popup
    Then logout Application

    Examples:
      | username  | password | firstname  | middlename  | lastname  |
      | Admin     | admin123 | farhan     | hassan      | naqvi     |