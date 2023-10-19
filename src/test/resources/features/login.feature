Feature: Successful login

  Scenario: login success
    Given I open login Page
    When I enter email "yana.kurenko@testpro.io"
    And I enter password "te$t$tudent"
    And I click submit
    Then I am logged in to website

