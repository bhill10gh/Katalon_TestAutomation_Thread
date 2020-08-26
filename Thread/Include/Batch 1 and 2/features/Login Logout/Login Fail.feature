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
@LoginFailfullFeature
Feature: Login Fail
  Test fail login

  @LoginFailScenario
  Scenario Outline: Login Fail
    Given Open browser and goto url: <url> for Login Fail
    When Click Login Link for Login Fail
		And Enter Username as <username> and Password as <password> for Login Fail
    And Click Login button for Login Fail
    Then Verify Login Failed for Login Fail

    Examples: 
      | url   												| username 							| password  							|
      | http://dev.graybox.velir.com/ |	barry.hill@velir.com	| 4T+8Tbuk6bw36WL+HA5rxw==|	