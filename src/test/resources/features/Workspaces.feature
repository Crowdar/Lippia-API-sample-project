@Workspaces
Feature: Como usuario de Clockify quiero interactuar con la API

  @TrerWorkspaces
  Scenario Outline: Traer todos mis Workspaces
    Given Con una cuenta creada en Clockify y X-Api-Key generados
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <status> is obtained
    And Obtengo los datos de mi Workspace

    Examples:
      | operation | entity    | jsonName       | status |
      | GET       | WORKSPACE | get_Workspaces | 200    |