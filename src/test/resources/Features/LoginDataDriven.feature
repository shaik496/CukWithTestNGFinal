Feature: DataDriven approach
 Scenario Outline: Login into Application
    Given I enter Username as "<userName>" and Password as "<password>"
   Examples:
      | userName | password  |
      |Admin|admin123|
      
  Scenario: Login into ORANGE Application
    Given login into ORANGE Applicaiton
      | userName | password  |
      | Admin    | admin123  |
      | Admin    | admin123  |