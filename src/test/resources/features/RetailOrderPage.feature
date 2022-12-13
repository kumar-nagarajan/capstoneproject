@test4
Feature: Retail Order Page 
 
Note: For this section, you need to first have orders in place. At least one order must be present 

Scenario: Verify User can cancel the order  
Given User is On retail website 
When User click On Sign in option 
And User enter email 'testt123@gmail.com' and password 'Password1**1*' 
And User click On login button 
And User Should be logged in into Account 
And User click on Orders section  
And User click on first order in list  
And User click On Cancel The Order button 
And User Select the cancelation Reason 'Bought wrong item' 
And User click On Cancel Order button 
Then a cancelation Message should be displayed 'Your Order Has Been Cancelled'


Scenario: Verify User can Return the order  
Given User is On retail website 
When User click On Sign in option 
And User enter email 'testt123@gmail.com' and password 'Password1**1*' 
And User click On login button 
And User Should be logged in into Account 
And User click on Orders section  
And User click on first order in list  
And User click on Return Items button 
And User select the Return Reason 'Item damaged' 
And User select the drop off service 'FedEx'
And User click on Return Order button 
Then a cancelation message should be displayed 'Return was successful' 

Scenario: Verify User can write a review on order placed 
Given User is on retail website 
When User click on Sign in option 
And User enter email 'testt123@gmail.com' and password 'Password1**1*' 
And User click on login button 
And User should be logged in into Account 
And User click on Orders section  
And User click on first order in list  
And User click on Review button  
And User write Review headline 'headline value' and 'review text'  
And User click Add your Review button 
Then a review message should be displayed 'Your review was added successfully'
