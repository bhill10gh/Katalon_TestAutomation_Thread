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
@tag
Feature: Event Filters Region Callapes

  @tag1
  Scenario Outline: Event Filters Region Callapes
    Given Region Callapes I am viewing the Events Page <url>
    When Region Callapes I click into Content Type Filter
    And Region Callapes I select Content Type = Region
    And Region Callapes I collapse the Filter
    Then Region Callapes The number of results matches the count shown_1_Cnt

    Examples: 
      | url                                 |
      | http://dev.graybox.velir.com/events |