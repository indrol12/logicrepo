
Feature: Gmail

  Scenario: gmail login successfull with valid credential
  
    Given user should sign with gmail account
    
    When I enter valid email & password
    
    Then login should be successfull
  