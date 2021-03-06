@module1
Feature: Hotel Booking In Adactin Application
Scenario Outline:: Login Page
Given user Launch The Application
When user Enter "<username>" In Username Field
And user Enter "<password>" In Password Field
#When user enters "srinath21" and "Test@123" in username and password field
Then user click Login Button

Examples:
	|username|password|
	|aaa|bbb|
	|123|456|
	|srinath21|Test@123|
	
@module2
Scenario: Search Hotel Page
When user Select Location From Location Dropdown
And user Select Name Of Hotel from Hotel Dropdown
And user Select Room Type From Room Type Dropdown
And user Select Number Of Rooms From Number Of Rooms Dropdown
And user Enter Check In Date In Check In Date Field
And user Enter Check Out Date In Check Out Date Field
And user Select Number Of Adults Per Room From Adults Per Room Dropdown
And user Select Number Of Children Per Room From Children Per Room Dropdown
Then user click Search Button

@module3
Scenario: Hotel Selection Page
When user Select Hotel From List Of Hotels Radio Button
Then user click Continue Button

@module4
Scenario: Payment Page
When user Enter First Name In First Name Field 
And user Enter Last Name In Last Name Field
And user Enter Address in Billing Address Field 
And user Enter Credit Card Number in Credit Card Number Field
And user Select Credit Card Type From Credit Card Type Dropdown
And user Select Credit Cardt Expiration Month From Expiration Month Dropdown
And user Select Credit Card Expiration Year From Expiration Year Dropdown
And user Enter Credit Card CVV Number in CVV Field
Then user Click Book Now Button
And user Click My Itinerary Button




