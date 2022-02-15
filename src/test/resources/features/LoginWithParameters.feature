
Feature: Login as different users


  Scenario: login as a user "10"

    Given  the user is on the login page
    When the user logs in using "user10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"


    #homework

@HW
    Scenario: login as a driver,store manager or sales manager

    Given the user is on the login page
    When the user logged in as "salesmanager"
    Then the user should be able to login
    And the title contains "Dashboard"

    #driver,storeManager,salesManager
  #you will have one step definition and it will handle different usertypes

 #cucumberde parametre girersek dynamic olur