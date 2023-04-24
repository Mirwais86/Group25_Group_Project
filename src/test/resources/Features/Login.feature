Feature: Admin Login Successfully

@VASmoke

  Scenario: Valid Admin Login
    Given open the browser and launch HMIS application
    When user enter valid email and valid password
    And click on login button
    Then user is logged in successfully

