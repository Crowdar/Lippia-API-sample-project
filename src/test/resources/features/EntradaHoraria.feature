@EntradaHoraria
Feature: EntradaDeHorario

  @TraerEntradasHorarias
  Scenario Outline: Consultar horas registradas
    And Con una cuenta creada en Clockify y X-Api-Key generados
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'get_Workspaces' and ''
    And se obtuvo el status code 200
    And Obtengo un workspaceid valido
    And I perform a 'GET' to 'USUARIO' endpoint with the 'get_Usuario' and ''
    And se obtuvo el status code 200
    And Obtengo un usuarioid valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    And Se valida las entradas horarias

    Examples:
      | operation | entity | jsonName             | status |
      | GET       | HORA   | get_EntradasHorarias | 200    |

  @NuevaEntradaHoraria
  Scenario Outline: Agregar una nueva entrada de horas
    And Con una cuenta creada en Clockify y X-Api-Key generados
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'get_Workspaces' and ''
    And se obtuvo el status code 200
    And Obtengo un workspaceid valido
    And I perform a 'GET' to 'PROYECTO' endpoint with the 'get_Proyecto' and ''
    And se obtuvo el status code 200
    And Obtengo un proyectoid
    And Agrego una descripcion '<descripcion>', una hora de inicio '<inicio>' y una hora de fin '<fin>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>

    Examples:
      | operation | entity        | jsonName          | status | descripcion | inicio               | fin                  |
      | POST      | NUEVA_ENTRADA | post_NuevaEntrada | 201    | nota        | 2023-12-22T14:27:22Z | 2023-12-27T08:22:27Z |