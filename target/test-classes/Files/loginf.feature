Feature: To check login funcionality of facebook account

  Background: 
    Given to open facebook through chrome

  
  Scenario: login valid user name and pass
    When user have enter valid user and invalid password
      | username | siva         |
      | password | hari         |
      | emailid  | sicaa@fgnsfg |
    Then invalid password msg

 
  Scenario: login valid user name and valid pass
    When user have enter valid user and valid password
      | username  | password | email |
      | java      | python   | sql   |
      | selenium  | git      | demo  |
      | cuccumber | testng   | junit |
    Then invalid password msg
