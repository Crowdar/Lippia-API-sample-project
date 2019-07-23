Feature: Api example
  As an api user I want to execute request in order to get proper responses

  @Example
  Scenario Outline: Example scenario for get user data
    Given As an api user for example endpoint
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>'
    Then I will get the proper status code '<statusCode>'
    And The proper 'Id' '<id>' returned in the response

    Examples:
      | jsonName    | statusCode | id | operation | entity |
      | exampleJson | 200        | 2  | GET       | USER   |
      | createUser  | 201        |    | POST      | USER   |

  @Example
  Scenario Outline: Example scenario for error 500
    Given As an api user for example endpoint
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>'
    Then I will get the proper status code '<statusCode>'

    Examples:
      | jsonName     | statusCode | operation | entity |
      | errorRequest | 500        | GET       | USER   |
