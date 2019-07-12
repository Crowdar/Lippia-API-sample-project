Feature: Api example
  As an api user I want to execute request in order to get proper responses

  @Example
  Scenario Outline: Example scenario for get user data
    Given As an api user for example endpoint
    When I perform a 'GET' to 'USER' endpoint with the '<id>'
    Then I will get the proper status code '<statusCode>'
    And The proper 'Id' '<id>' returned in the response

    Examples:
    |id |statusCode| 
    | 2 |200       |
