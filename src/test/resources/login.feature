Feature: Book A ride
Scenario: login only with valid data
Given user enters "username" in phone
And user enters "password" in password
When user clicks on "submit"
Then login page displays "welcome"
And it redirects to user home.

Scenario: login with invalid data
Given user enters "" in phone
And user enters "" in password
When user clicks on "submit"
Then login page displays "Wrong data"
And it redirects to user home.

