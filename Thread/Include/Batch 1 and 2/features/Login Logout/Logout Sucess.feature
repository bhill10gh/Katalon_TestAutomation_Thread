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
@LoginSuccessfullFeature
Feature: Logout Successful
  Test successful Logout

  @LoginSuccessfullScenario
  Scenario Outline: Logout Successfully
    Given Open browser and goto url: <url> for Logout Successfully
    When Click Login Link for Logout Successfully
		And Enter Username as <username> and Password as <password> for Logout Successfully
    And Click Login button for Logout Successfully
    And Click Logout button for Logout Successfully
    Then Verify Login link is in upper right for Logout Successfully

    Examples: 
      | url   												| username 							| password  							|
      | http://dev.graybox.velir.com/ |	barry.hill@velir.com	| Ol/4yJSh8M5kTu+5BkT01A==|	