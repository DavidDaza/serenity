#Author: david.d.08@hotmail.com
Feature: login into the application
  Whit administrator i want that a user to login into application 

  Scenario: Succes Login
    Given David wants make login into the aplication
    When he send valid credentials
    Then he should to acces to the application  
   
  Scenario: Fail Succes
    Given William wants make login into the aplication with invalid credentials
    When he send invalid credentials
    Then he should not to acces to the application  

