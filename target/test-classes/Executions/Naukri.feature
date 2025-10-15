Feature: Updating Naukri Profile Automatically

@Naukri
Scenario: Verify that user should get able to update the profile by uploading resume
Given User should be at Login page
When User clicks on Login button
And User enters Username as "<username>"
And User enters Password as "password"
And User clicks on Login button2
When User clicks on profile button
And User clicks on View & Update Profile button
Then User should be able to upload the resume successfully
And User should get Success message
When User clicks on Resume Headline edit button
And User enters Resume Headline
And User clicks on Save button
Then Verify that user should get Resume Headline Success message
When User clicks on profile button
And User clicks on Logout button
Then Verify that user should get navigates to Registration page