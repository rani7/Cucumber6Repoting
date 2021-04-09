Feature: Cucumber Reporting feature
Background: launch browser
Given when user launches the browser

Scenario: launch testv3 cashpoint site
Given user enters testv3 cashpoint whitelisting url
When user goes to the testv3 cashpoint site
Then user is on the testv3 cashpoint home page
And browser is closed

Scenario: launch cashpoint site
Given user enters cashpoint whitelisting url
When user goes to the cashpoint site
Then user is on the cashpoint home page
And browser is closed