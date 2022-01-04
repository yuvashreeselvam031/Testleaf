Feature: Login functionality of salesforce

Scenario: Create Account

Given Load the webpage
Then enter the username
Then enter the password
When click the login button
And verify HomePage
When Click on toggle menu
And Click on viewAll
And Click on Sales
And Click on Accounts tab 
And Click on New button
Given Enter your name as account name
When Select Ownership as Public
And click on save Button
Then verify your name