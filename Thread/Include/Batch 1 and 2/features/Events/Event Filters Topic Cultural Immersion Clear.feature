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
Feature: Event Filters Topic Cultural Immersion Clear
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Event Filters Topic Cultural Immersion Clear
    Given Cultural Immersion Clear I am viewing the Events Page <url>
    And Cultural Immersion Clear I select Topic = Cultural Immersion
    When Cultural Immersion Clear I click into Topic Filter
    And Cultural Immersion Clear I click on Clear All
    And Cultural Immersion Clear I collapse the Filter
    Then Cultural Immersion Clear The Filter displays Topic

    Examples: 
      | url                                 |
      | http://dev.graybox.velir.com/events |