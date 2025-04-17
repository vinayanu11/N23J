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
@LoginFeature
Feature: Login feature scenarios

  @tag1
  Scenario: Validate login to OrangeHRM Site with valid credentials
    #Given chrome browser is launched
    Given user navigated to OrangeHRM Login page
    When user enters Username
    And user enters Password
    And user clicks on Login button
    Then user should able to see Dashboard URL
    #And user should see Dashboard text
    
   @tag2 
   Scenario: Validate login to OrangeHRM with parameters in feature file
    #Given chrome browser is launched
    Given user navigated to OrangeHRM Login page
    When user enters Username "Admin"
    And user enters Password "admin123"
    And user clicks on Login button
    Then user should able to see Dashboard URL 

    