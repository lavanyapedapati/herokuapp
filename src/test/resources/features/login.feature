@login 
Feature: Heroku Login 
	As a heroku user I want to be able to:
  - Login to the site

@loginSuccess 
Scenario Outline: Successful login to heroku site 
	Given I am on Heroku login page 
	When I login using "<username>" and "<password>" 
	Then I should be able to successfully login 
	Examples: 
		| username |password |
		| tomsmith    |SuperSecretPassword!|
