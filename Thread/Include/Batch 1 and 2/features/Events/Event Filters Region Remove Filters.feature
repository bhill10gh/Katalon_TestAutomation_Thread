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
Feature: Event Filters Region Remove Filters

  @tag1
  Scenario Outline: Event Filters Region Remove Filters
    Given Remove Filters I am viewing the Events Page <url>
    And Remove Filters I select Content Type = Region
    When Remove Filters I click into Content Type Filter
    And Remove Filters I click on Clear All
    And Remove Filters I collapse the Filter
    Then Remove Filters The Filter displays Content Type

    Examples: 
      | url                                 |
      | http://dev.graybox.velir.com/events |