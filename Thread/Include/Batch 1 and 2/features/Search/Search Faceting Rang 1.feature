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
Feature: Search Faceting Rang 1
  Test Search Faceting Rang 1

  Scenario Outline: Search Faceting Rang 1
    Given Open Browser Goto Search Page <url> for Search Faceting Rang 1
    When Enter search <keyword> for Search Faceting Rang 1
    And Click search for Search Faceting Rang 1
    And Verify result range <upperSearchRange> to <lowerSearchRange> for Search Faceting Rang 1
    And Click Content Type Facet Menu for Search Faceting Rang 1
    And Click Facet Region for Search Faceting Rang 1
    Then Verify facet range <upperFacetRange> to <lowerFacetRange> for Search Faceting Rang 1

    Examples: 
      | keyword | upperSearchRange | lowerSearchRange | upperFacetRange | lowerFacetRange | url                                                                                                                       |
      | QA      |               35 |               45 |               1 |              10 | http://dev.graybox.velir.com/qa-automated-testing-folder/qa-search-page?q&sortBy=relevance&sortOrder=asc&page=1&daterange |
