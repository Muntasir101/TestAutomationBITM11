Feature: OpenCart Login Invalid
  Scenario: Verify Login with Invalid Email and Password
    Given I launch Chrome Browser
    When I open Opencart Login page
    And I Enter Email and I enter Password and click Login
    Then Error message display and close Browser