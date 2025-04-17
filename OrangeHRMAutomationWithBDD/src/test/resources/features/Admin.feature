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
@AdminFeature
Feature: OrangeHRM Admin Feature

  Background: Precondition steps for Admin Feature
    Given user navigated to OrangeHRM Login page
    When user enters Username
    And user enters Password
    And user clicks on Login button
    

  @navigateToAdminModule @TC_AM_001
  Scenario: Validate the Navigation to admin module
    When User clicks on Admin menu item
    And User enters username
    And Click on dropdown and select admin
    And Click on Search button 
    Then User should see "Admin" in the table
    
    @TC_AM_002
  Scenario: Validate ESS user status is enabled
    When User clicks on Admin menu item
    And Click on dropdown and select ESS
    And Select Status Enabled
    And Click on Search button 
    Then User should see "ESS"  and "Enabled"in the table
    