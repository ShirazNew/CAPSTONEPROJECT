@CapStoneTest
Feature: Items on the retail page test

Background: 
	Given User is on Retail website
	When User click on the desktop
	And User click on all desktop

	@Test44
Scenario: Retail page Items verifing 
	Then User should all items are present in Desktop page
	
	@Test45
	Scenario: User add HP LP 3065 from Desktops tab to the cart
When User click ADD TO CART option on ‘HP LP3065’ item
	And User select quantity '1'
And User click add to Cart button
Then User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’

@Test46
Scenario: User add Canon EOS 5D from Desktops tab to the cart
And User click ADD TO CART option on ‘Canon EOS 5D’ item
	And User select quantity '1'
And User select color from dropdown ‘Red’
And User click add to Cart button
Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’

@Test47
Scenario: User add a review to Canon EOS 5D item in Desktops tab
And User click on Canon EOS 5D item
And User click on write a review link
And user fill the review information with below information
|yourname|YourReview| Rating|
|abdulaq|very good item for mr abduhaq and his some friends and he is very happy very good item for mr abduhaq and his some friends and he is very happy| good|
And User click on Continue Button
Then User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval'”

@Test48
Scenario: Add and Remove a Mac book from Cart
Given User is on Retail website
When User click on Laptop &NoteBook tab
And User click on Show all Laptop &NoteBook option
And User click on MacBook item
And User click add to Cart button
Then User should see a message ‘Success: You have added MacBook to your shopping cart!’
 And User should see ‘1 item(s)-602.00’ showed to the cart
And User click on cart option
And user click on red X button to remove the item from cart
Then item should be removed and cart should show ‘0 item(s)’

@Test49
Scenario: Product Comparison
Given User is on Retail website
When User click on Laptop &NoteBook tab
And User click on Show all Laptop &NoteBook option
And User click on product comparison icon on ‘MacBook’
#And User click on product comparison icon on ‘MacBook Air
#Then User should see a message ‘Success: You have added MacBook Air to your product comparison!’
And User click on Product comparison link
Then User should see Product Comparison Chart

@Test50
Scenario: Adding an item to Wish list    
Given User is on Retail website 
When User click on Laptop &NoteBook tab  
And User click on Show all Laptop &NoteBook option  
And User click on heart icon to add ‘Sony VaIO’ laptop to wish list  
Then User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’
 
@Test51
Scenario: Validate the price of MacBook Pro is 2000    
Given User is on Retail website 
When User click on Laptop &NoteBook tab  
And User click on Show all Laptop &NoteBook option  
And User click on ‘MacBook Pro’ item  
Then User should see  ‘$2,000.00’ price tag is present on UI



	