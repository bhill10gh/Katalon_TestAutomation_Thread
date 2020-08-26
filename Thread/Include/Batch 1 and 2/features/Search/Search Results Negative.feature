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
Feature: Search Results Negative
  Test search Results Negative

  Scenario Outline: Search Results Negative
    Given Open Browser Goto Search Page <url> for Search Results Negative
    When Enter search <keyword> for Search Results Negative
    And Click search for Search Results Negative
    Then Verify no results text <noResultsText> is present for Search Results Negative

    Examples: 
      | keyword             | noResultsText                         | url                                                                                                                       |
      | QA Landing blahblah | No results found to match your query. | http://dev.graybox.velir.com/qa-automated-testing-folder/qa-search-page?q&sortBy=relevance&sortOrder=asc&page=1&daterange |
