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
Feature: Login Successful
  Test successful login

  @LoginSuccessfullScenario
  Scenario Outline: Login Successfully
    Given Open browser and goto url: <url> for Login Successfully
    When Click Login Link for Login Successfully
		And Enter Username as <username> and Password as <password> for Login Successfully
    And Click Login button for Login Successfully
    Then Verify Logout link is in upper right for Login Successfully

    Examples: 
      | url   												| username 							| password  							|
      | http://dev.graybox.velir.com/ |	barry.hill@velir.com	| Ol/4yJSh8M5kTu+5BkT01A==|	
      | http://dev.graybox.velir.com/ |	barry.hill@velir.com	| JfpAld/04/wkqRLZ5w5+4w==|