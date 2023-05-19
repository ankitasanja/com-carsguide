Feature: Search functionality
  As a user I want to search the buy car with model

  @sanity @regression
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When  I mouse hover on "buy+sell" tab
    And   I click on "Search Cars" link
    And   I navigate to "new and used car search" page
    And   I select make "<make>"
    And   I select model "<model>"
    And   I select any location "<location>"
    And   I select price(max) "<price>"
    And   I click on Find My Next Car tab
    Then  I should see the make "<make>" in results
    Examples:
      | make    | model    | location     | price   |
      | Audi    | S6       | NSW - All    | $35,000 |
      | BMW     | 1 Series | NT - All     | $40,000 |
      | Nissan  | Atlas    | NSW - Sydney | $25,000 |
      | Tesla   | Model 3  | ACT - All    | $60,000 |
      | Skoda   | Rapid    | QLD - All    | $35,000 |
      | Renault | Clio     | SA - All     | $30,000 |

 # @smoke  @regression
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When  I mouse hover on "buy+sell" tab
    And   I click "Used" link
    And   I navigate to "Used Cars For Sale" page
    And   I select make "<make>"
    And   I select model "<model>"
    And   I select any location "<location>"
    And   I select price(max) "<price>"
    And   I click on Find My Next Car tab
    Then  I should see the make "<make>" in results
    Examples:
      | make          | model     | location     | price   |
      | Honda         | Fit       | ACT - All    | $3,000  |
      | Mercedes-Benz | A-Class   | NT - All     | $20,000 |
      | Lamborghini   | Aventador | QLD - All    | $70,000 |
      | Audi          | A1        | NSW - All    | $20,000 |
      | BMW           | 1 Series  | SA - All     | $25,000 |
      | MG            | 3         | NSW - Sydney | $10,000 |
