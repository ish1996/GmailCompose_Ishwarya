Feature: function to login to gmail just a demo using Page factory

  Scenario Outline: function to login to gmail
    Given go to gmail
    When give the <user> and <pass>
    Then user is logged in

    Examples: 
      | user                        | pass       |
      | xyz@gmail.com | abc |
