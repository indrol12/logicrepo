Feature:calculator operators

  Scenario: check whether arithmatic operators are working fine
    Given calculator website should get launch
    When I click on number 1 , number 4 & + operator
    And I click on number 6 , number 8 & - operator
    And I click on number 9 , number 2 & * operator
    And I click on number 3 , number 5 & / operator
    Then result should get display according to the operators
    But result should not get display according to the operators
