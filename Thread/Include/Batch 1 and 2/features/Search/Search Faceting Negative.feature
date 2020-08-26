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
Feature: Search Faceting – Negative
  Test search faceting Negative

  Scenario Outline: Search Faceting – Negative
    Given Open Browser Goto Search Page <url> for  Search Faceting – Negative
    When Click Topics Facet Menu for  Search Faceting – Negative
    And Click Facet Food for  Search Faceting – Negative
    Then Click QA Landing Page for  Search Faceting – Negative

    Examples: 
      | url                                                                                                                       |
      | http://dev.graybox.velir.com/qa-automated-testing-folder/qa-search-page?q&sortBy=relevance&sortOrder=asc&page=1&daterange |
