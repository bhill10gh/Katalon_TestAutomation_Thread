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
Feature: Event Filters Topic Cultural Immersion Results
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Event Filters Topic Cultural Immersion Results
    Given Cultural Immersion Results I am viewing the Events Page <url>
    When Cultural Immersion Results I click into Topic Filter
    And Cultural Immersion Results I view the number of results shown in the Topics_1_Cnt
    And Cultural Immersion Results I select Topic = Cultural Immersion
    Then Cultural Immersion Results The number of results matches the count shown_1_Cnt

    Examples: 
      | url                                 |
      | http://dev.graybox.velir.com/events |