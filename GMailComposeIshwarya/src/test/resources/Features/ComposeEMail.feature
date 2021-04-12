Feature: Compose function in Gmail

  Scenario Outline: function in Gmail
    Given navigate to gmail
    When enter <user> and <pass>
    And user clicks on compose button
    And type the to <address>
    And type the subject
    And type the body
    And user clicks on send button
    Then email is sent

    Examples:
    |user|pass|address|
    |xyz@gmail.com|Passwordl|abc@gmail.com|