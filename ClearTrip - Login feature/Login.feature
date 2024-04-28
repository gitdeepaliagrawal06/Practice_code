#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions ///Action
#Then: To observe outcomes or validation //Verification
#And,But: To enumerate more Given,When,Then steps //continuation
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
--------------------------------------------------------------------------------------------------
Login Functionaliy:

Pre-requisite/Given :Website should be up and running
How to Login : username & password

1. Valid username and password and check for login
2. Invalid username and password and check for login

Feature: Login feature for Clear Trip

Scenario: Check Login with valid username and password
Given Application should be up and running
And User is on Login Page
When I enter registered email address in username field
And I enter vaild password in password field
And click on login button
Then User should be redirected to home page
And Username should be displayed on home page 









