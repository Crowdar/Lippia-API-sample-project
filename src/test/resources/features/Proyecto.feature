@Proyecto
Feature: Como usuario de Clockify quiero interactuar con la API

  @TraerProyecto
  Scenario Outline: Traer todos mis Workspaces
    And Con una cuenta creada en Clockify y X-Api-Key generados
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'get_Workspaces' and ''
    And se obtuvo el status code 200
    And Obtengo un workspaceid valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <status> is obtained
    And Validacion de proyecto

    Examples:
      | operation | entity   | jsonName     | status |
      | GET       | PROYECTO | get_Proyecto | 200    |