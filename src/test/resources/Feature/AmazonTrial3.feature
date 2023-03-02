Feature: Search Module Validation

Scenario: To validate search module with iphone option

		Given To launch url
		When To click signIn button
    And To enter valid mailID
    And To click continue button
    And To enter valid password
    And To click signIn 
    When To enter value iphone13 in search option
    And To click continue button
    And To scroll down to product iphone13
    And To select Apple iPhone 13 (128GB) - (Product) RED
    And To click add to cart button
    Then To take screenshot4
    And To click cart button
    And To change the order quantity
    Then To take screenshot5
    And To go to homepage
    And To go to cart page
    And To decrease the order quantity
    Then To take screenshot6
    And To go to homepage
    And To enter value backbag in search option
    And To click continue button
    And To scroll down to product SkyBags
    And To select product SkyBags
    And To click add to cart button in SkyBag window
    Then To take screenshot7
    And To click proceed to buy option 
    And To conform delivery address
    And To select Pay with Debit card option
    Then To take screenshot8
    And To click Enter card details option
    And To click cart button in homepage
    And To delete first order
    And To delete second order
    And To go to homepage
    
    
    
    
 
    
    
    