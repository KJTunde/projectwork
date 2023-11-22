Feature: A specific product can be found using the "Search" function on the page

  Rule: If I search for a product, a list of the searched products will be displayed

    Background:
      Given I open the home page
      And I accept cookies

    Scenario Outline: Search for an existing products
      When  I search for the "<productName>"
      Then "<numberOfProducts>" product are displayed
      And the product's name contains "<productName>"
      And header contains the word "<productName>"

      Examples:
        | productName | numberOfProducts  |
        | fahéj       | 21                |
        | birsalma    | 5                 |
        | lencse      | 16                |

  Rule: If I search with empty input search, nothings happens.

    Background:
      Given I open the home page
      And I accept cookies

    Scenario: Search with empty input
      When  I search for ""
      Then search function does nothing

  Rule: If I search for a non-existing product a message displayed

    Background: :
      Given I open the home page
      And I accept cookies

    Scenario:  Search for a non-existing product (XYZ)
      When I search for "XYZ"
      Then message displayed that the search didn't find anything
      And "Shop groceries" button is available
      And "Search" button is available
