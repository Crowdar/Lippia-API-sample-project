Feature: Api example
  As an api user I want to execute request in order to get proper responses

  @Example
  Scenario Outline: Example scenario for get user data
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then I will get the proper status code '<statusCode>'
    And The proper 'Id' '<id>' returned in the response

    Examples:
      | jsonName    | statusCode | id | operation | entity |
      | exampleJson | 200        | 2  | GET       | USER   |
      | createUser  | 201        |    | POST      | USER   |

  @Example
  Scenario Outline: Example scenario for error 500
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then I will get the proper status code '<statusCode>'

    Examples:
      | jsonName     | statusCode | operation | entity |
      | errorRequest | 500        | GET       | USER   |


  @Example
  Scenario Outline: Example scenario for input parameters
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonRequestName>' and '<inputParameters>'
    Then I will get the proper status code '<statusCode>'
    And I will get the proper response in '<jsonResponseName>'

    Examples:
      | jsonRequestName        | statusCode | operation | entity           | inputParameters         | jsonResponseName        |
      | responseHeadersRequest | 200        | GET       | RESPONSE_HEADERS | value1:bar1,value2:bar2 | responseHeadersResponse |