@test2 
Feature: Retail Account Page 

#Note: For this feature you have to have an account and be logged in into account. Repeated steps are under Background Keyword 
Background: 

	Given User is on retail website 
	When User click on Sign in option 
	
	
	
Scenario: Verify User can update Profile Information 
	And User enter email 'testt123@gmail.com' and password 'Password1**1' 
	And User click on login button 
	And User should be logged in into Account 
	When User click on Account option 
	And User update Name "Test" and Phone "9234567893" 
	And User click on Update button 
	Then user profile information should be updated 
	
Scenario: Verify User can Update password 
	And User enter email 'testt123@gmail.com' and password 'Password1**1' 
	And User click on login button 
	And User should be logged in into Account 
	When User click on Account option 
	And User enter below information 
		|previousPassword| newPassword|confirmPassword| 
		|Password1**1 |Password1**1*  |Password1**1* | 
	And User click on Change Password button 
	Then a message should be displayed 'Password Updated Successfully' 
	
	
Scenario: Verify User can add a payment method 
	And User enter email 'testt123@gmail.com' and password 'Password1**1*' 
	And User click on login button 
	And User should be logged in into Account 
	When User click on Account option 
	And User click on Add a payment method link 
	And User fill Debit or credit card information 
		|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode| 
		|1444567330654126 | Test |12 |2027   |123  |   
	And User click on Add your card button 
	Then a Message should be displayed 'Payment Method added successfully' 
	
Scenario: Verify User can edit Debit or Credit card 
	And User enter email 'testt123@gmail.com' and password 'Password1**1*' 
	And User click on login button 
	And User should be logged in into Account 
	When User click on Account option 
	And User click on Edit option of card section 
	And user edit information with below data 
		|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode| 
		|1444567844123319 | Test  |12    |2028  |121| 
	And user click on Update Your Card button 
	Then a MEssage should be displayed 'Payment Method updated Successfully' 
	
Scenario: Verify User can remove Debit or Credit card 
	And User enter email 'testt123@gmail.com' and password 'Password1**1*' 
	And User click on login button 
	And User should be logged in into Account 
	When User click on Account option 
	And User click on remove option of card section 
	Then payment details should be removed 
	
Scenario: Verify User can add an Address 
	And User enter email 'testt123@gmail.com' and password 'Password1**1*' 
	And User click on login button 
	And User should be logged in into Account 
	When User click on Account option 
	And User click on Add address option 
	And user fill new address form with below information 
		|country|fullName|phoneNumber|streetAddress|apt      |city     | state |zipCode| 
		| United States | Test Tester  | 7234567890   | 111 main street  | 123 | Sacramento | California | 12000   | 
	And User click Add Your Address button 
	Then a message should be Displayed 'Address Added Successfully' 
	
Scenario: Verify User can edit an Address added on account 
	And User enter email 'testt123@gmail.com' and password 'Password1**1*' 
	And User click on login button 
	And User should be logged in into Account 
	When User click on Account option 
	And User click on edit address option 
	And user fill new Address form with below information 
		|country|fullName|phoneNumber|streetAddress|apt      |city     | state |zipCode| 
		| United States | Test Testerr  |61234567899   | 121 cross street  | 103 | Sacramento | California | 12001   |  
	And User click update Your Address button 
	Then a message should Be displayed 'Address Updated Successfully' 
	
	
Scenario: Verify User can remove Address from Account 
	And User enter email 'testt123@gmail.com' and password 'Password1**1*' 
	And User click on login button 
	And User should be logged in into Account 
	When User click on Account option 
	And User click on remove option of Address section 
	Then Address details should be removed 
	
