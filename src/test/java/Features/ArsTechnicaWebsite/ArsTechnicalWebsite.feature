Feature: Ars Technical Website
  As: Customer
  I Want: Create a New Website
  To: Post news

  Scenario: Search a post in the news website
    When I access the news website
    And I search for a post using a existent title
    Then the news website must return the searched post in a results page

  Scenario: User sign-up invalid email
    When I try to sign up or create a new account
    And I try to register a account with a invalid email format
    Then  It returns a error message "The e-mail address you entered is invalid" on a visible place
