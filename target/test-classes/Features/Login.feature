Feature: Login Functionality 
	
@Smoke	
Scenario: Login with valid credentails
	Given the user is on the login page 
	When the user enters username "tomsmith"
	And the user enters password "SuperSecretPassword!"
	And the user clicks the login button
	Then the user should see the message "You logged into a secure area!"
	
@Regression	
Scenario: Login with Invalid credentails
	Given the user is on the login page 
	When the user enters username "wronguser"
	And the user enters password "wrongpassword"
	And the user clicks the login button
	Then the user should see the message "Your username is invalid!"
	
@Sanity	
Scenario Outline: Validate login with different credentials
	Given the user is on the login page 
	When the user enters username "<username>"
	When the user enters password "<password>"
	And the user clicks the login button
	Then the login result should be "<expectedMessage>"
	Examples:
	|username| |password| |expectedMessage|
	|tomsmith| |SuperSecretPassword!| |You logged into a secure area!|
	|wrongusername| |wrongpassword| |Your username is invalid!|
	|tomsmith| |wrongpassword| |Your password is invalid!|
	|wrongusername| |SuperSecretPassword!| |Your username is invalid!|
	|| | | |Your username is invalid!|	
	