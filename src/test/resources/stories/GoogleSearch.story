Narrative: In order to search on Google with keyword

Scenario: As a user I want to search on Google
Given I go to Google page
When I search keyword <keyword>
Then I receive results included a string <expected>

Examples:
|keyword|expected|
|JBehave|What is JBehave?|
