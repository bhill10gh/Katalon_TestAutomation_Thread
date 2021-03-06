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
Feature: Contact Us Success
  Test contact us validation for all input

  Scenario Outline: Contact Us Success
    Given Open Browser Goto Contact Us Page <url> for Contact Us Success
    And Fill all fields for Contact Us Success
    When Click Submit Bttn for Contact Us Success    
    Then On Contact Us Reply Page

    Examples: 
      | url                                                                                                                       |
      | http://dev.graybox.velir.com/ |