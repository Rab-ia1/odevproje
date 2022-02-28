Feature: to send appreciation by clicking on the Appreciation subheading from "More" tab under Activity Stream

 Scenario: : User is logged in
    Given user navigate to the logged page
    When user submit username and password
    And Enter the login button
    Then user should be login
    Given the user clicks More tab on the top of the home page
    And the user select appreciation

  Scenario:Quote
    Given click Quote icon to add command
    Then the user copy or write the message


  Scenario: to add a link

    Given the user clicks icon to add link
    Then the user copies the link to the text box in order to add


  Scenario: to add mention by clicking on the Add mention icon.

    Given the user clicks hashtag # icon to add mention
    Then user write mention



  Scenario: to send appreciation

    Then click to send button








