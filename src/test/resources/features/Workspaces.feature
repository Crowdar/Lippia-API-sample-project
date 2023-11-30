@Workspaces
Feature: Workspace

  @TraerWorkspaces
  Scenario Outline: Traer todos los workspaces
    Given Con una cuenta creada en Clockify y X-Api-Key
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <status> is obtained
    Then Obtengo mis workspaces

    Examples:
      | operation | entity    | status | jsonName       |
      | GET       | WORKSPACE | 200    | get_Workspaces |