
Feature: Test the Google Home page

Test will cover major functionality such as search bar, buttons, and logo of the company


#Test Case
#Given, When and Then... And buttons

Scenario: Website is loaded with right home page or not
    When user open browser and enter http://google.company
    Then Browser should open with google home page
    And System should verify the url address to confirm

Scenario: Google home page has google log and Search bar
When User should see the Google log and Search bar logo
When User should be able to type anything and should be visible and logged
Then Browser should open any Website Page upon User's request from Seach Box if it finds


Scenario: Search Bar has microphone feature within Search Bar
When User should be able to see the microphone logo in the Search bar
And michrophone should be active by clicking and switched to microphone page
Then microphone page is built to accept any verbal command to find any info based on that reques 

Scenario: Google home page has Gmail and Images links
When User should be able to see Gmail and Images links on right top corner 
And User should be able to connect his/her gmail account to Google link
And When User should be able to see his/her email logo on right top corner
Then User should be able to click on Gmail link to be landed on his/her gmail account


Scenario: Google home page has Google Apps
When User should be able to see google apps logo in right top corner
When User should be to see all google apps deployed on Google Home Page by clicking on it's logo
Then User should be able to pick any apps shosen 


Scenario: Google home page has all bookmarks attached under Url top Search Bar
When User should be able to create bookmark folder
Then User should be able to see all his/her bookmarks folders attached under Url top search bar

