@test3 
Feature: Retail Home Page 

Scenario: Verify Shop by Department sidebar  
Given User is on retail website 
When User click on All section 
Then below options are present in Shop by Department sidebar 
|Electronics|Computers|Smart Home|Sports|Automative| 
 
Scenario Outline: Verify department sidebar options    
Given User is on retail website 
When User click on All section 
And User on <department>  
Then below options are present in department 
|<optionOne>|<optionTwo>| 
 
Examples:  
|department| optionOne   | optionTwo| 
| Electronics| TV & Video | Video Games| 
|Computers |Accessories                    |Networking        | 
|Smart Home| Smart Home Lightning          | Plugs and Outlets| 
|Sports    | Athletic Clothing             | Exercise & Fitness| 
|Automotive| Automative Parts & Accessories| MotorCycle & Powersports| 
 
Scenario: Verify User can add an item to cart  
 
Given User is on retail website 
When User click on Sign in option 
And User enter email 'testt123@gmail.com' and password 'Password1**1*' 
And User click on login button 
And User should be logged in into Account 
And User change the category to 'Smart Home' 
And User search for an item 'Kasa Outdoor Smart Plug' 
And User click on Search icon 
And User click on item  
And User select quantity '2' 
And User click add to Cart button  
Then the cart icon quantity should change to '2' 
 
Scenario: Verify User can place an order without Shipping address and payment Method on file 
 
Given User is on retail website 
When User click on Sign in option 
And User enter email 'testt123@gmail.com' and password 'Password1**1*' 
And User click on login button 
And User should be logged in into Account 
And User change the category to 'Smart Home' 
And User search for an item 'Kasa Outdoor Smart Plug' 
And User click on Search icon 
And User click on item  
And User select quantity '2' 
And User click add to Cart button  
Then the cart icon quantity should change to '2' 
And User click on Cart option  
And User click on Proceed to Checkout button 
And User click Add a new address link for shipping address  
And User fill new address form with below information  
|country|fullName|phoneNumber|streetAddress|apt      |city     | state |zipCode| 
|United States|Test Tester|1234567809 |321 cross street|110 | San Jose | California|13245| 
And User click Add Your Address button  
And User click Add a credit card or Debit Card for Payment method 
And User fill Debit or credit card information  
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode| 
|1234577891234558 |Test Tester  | 12 | 2026 | 321  | 
And User click on Add your card button  
And User click on Place Your Order 
Then a message Should be displayed 'Order Placed, Thanks' 

Scenario: Verify User can place an order with Shipping address and payment Method on file 
 
Given User is on retail website 
When User click on Sign in option 
And User enter email 'testt123@gmail.com' and password 'Password1**1*' 
And User click on login button 
And User should be logged in into Account 
And User Change the category to 'Electronics'
And User Search for an item 'Apex Legends' 
And User Click on Search icon 
And User Click on item  
And User Select quantity '5'
And User Click add to Cart button  
Then the Cart icon quantity should change to '5' 
And User Click on Cart option  
And User Click on Proceed to Checkout button 
And User Click on Place Your Order 
Then A Message should be displayed 'Order Placed, Thanks' 

