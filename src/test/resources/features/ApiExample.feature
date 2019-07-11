Feature: Api example
  As an api user I want to execute request in order to get proper responses

  @Example
  Scenario Outline: Example scenario for get user data
    Given As an api user for example endpoint
    When I perform a GET to users endpoint with the id '<id>'
    Then I will get the proper status code '<statusCode>'
    And The proper '<id>' returned in the response

    Examples:
    |id |statusCode|
    | 2 |200       |
