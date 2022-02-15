Feature:  Account types
@wip @smoke
  Scenario: Driver user
    Given the user logged in as "driver"
    When  the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar Events - Activities"
@wip
    Scenario: Sales manager user
      Given the user logged in as "salesmanager"
      When the user navigates to "Customers" "Accounts"
      Then the title contains "Accounts - CustomerS"
 @wip @smoke
      Scenario: Store manager user
        Given the user logged in as "storemanager"
        When the user navigates to "Customers" "Contacts"
        Then the title contains "Contacts - Customers"

  #Scenario: Driver user
  #  Given the user logged in as "driver"

 # Scenario: Sales manager user
  #  Given the user logged in as "sales manager"

  #Scenario: Store manager user
 #   Given the user logged in as "store manager"

    Scenario Outline: Login with different accounts<userType>
      Given  the user logged in as "<userType>"
      When the user navigates to "<tab>" "<module>"
     Then the title contains "<title>"

     Examples:
      |userType       | tab       |module         |title|
      |driver         | Activities|Calendar Events|Calendar Events - Activities|
      |storemanager   |Customers  |Accounts       |Accounts - Customers        |
      |salesmanager   |Customers  |Contacts       |Contacts - Customers        |











