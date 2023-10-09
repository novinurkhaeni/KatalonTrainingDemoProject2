#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@userflow
Feature: Test login account

  @regression
  Scenario Outline: Verify login functionality
    Given I am on the homepage
    And I should see login link
    When I follow login link
    And I fill email address with <email>
    And I fill password with <password>
    And I click login button
    Then I should see profile menu
    And I should see profile link
    But I should not see login link

		@valid
    Examples: 
      | email            | password   | status  |
      | novi@kompas.com  | kompas2019 | success |

		@invalid
    Examples: 
      | email            | password   | status  |
      | novii@kompas.com | kompas2020 | Fail    |
