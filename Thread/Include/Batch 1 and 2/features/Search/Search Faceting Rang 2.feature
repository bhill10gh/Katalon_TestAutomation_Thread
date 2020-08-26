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
Feature: Search Faceting Rang 2
  Test Search Faceting Rang 2

  Scenario Outline: Search Faceting Rang 2
    Given Open Browser Goto Search Page <url> for Search Faceting Rang 2
    When Enter search <keyword> for Search Faceting Rang 2
    And Click search for Search Faceting Rang 2
    And Click Content Type Facet Menu for Search Faceting Rang 2
    And Click Facet Region for Search Faceting Rang 2
    Then Verify Region Facet count is <regionFacetCnt> for Search Faceting Rang 2

    Examples: 
      | keyword | regionFacetCnt | url                                                                                                                       |
      | QA      |              4 | http://dev.graybox.velir.com/qa-automated-testing-folder/qa-search-page?q&sortBy=relevance&sortOrder=asc&page=1&daterange |
