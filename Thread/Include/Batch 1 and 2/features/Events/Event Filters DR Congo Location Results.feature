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
Feature: Event Filters DR Congo Location Results
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Event Filters DR Congo Location Results
    Given DR Congo Location Results I am viewing the Events Page <url>
    When DR Congo Location Results I click into Location Filter
    And DR Congo Location Results I select Location = DR Congo
    Then DR Congo Location Results Have Location = DR Congo

    Examples: 
      | url                                 |
      | http://dev.graybox.velir.com/events |