@EntradaDeHorario
Feature: EntradaDeHorario

  @Consulta
  Scenario Outline: Consultar horas registradas
    And Con una cuenta creada en Clockify y X-Api-Key
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'get_Workspaces' and ''
    And Obtengo un workspaceid valido
    And Obtengo el usuarioid valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Obtengo las horas consultadas

    Examples:
      | operation  | entity | jsonName             | status |
      | GETENTRADA | HORA   | get_EntradasHorarias | 200    |

  @NuevaEntradaHoras
  Scenario Outline: Agregar una nueva entrada de horas
    And Con una cuenta creada en Clockify y X-Api-Key
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'get_Workspaces' and ''
    And se obtuvo el status code 200
    And Obtengo un workspaceid valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>

    Examples:
      | operation | entity        | jsonName          | status |
      | POST      | NUEVA_ENTRADA | post_NuevaEntrada | 201    |

  @Editar
  Scenario Outline: Editar una entrada
    And Con una cuenta creada en Clockify y X-Api-Key
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'get_Workspaces' and ''
    And se obtuvo el status code 200
    And Obtengo un workspaceid valido
    And I perform a 'POST' to 'NUEVA_ENTRADA' endpoint with the 'post_NuevaEntrada' and ''
    And se obtuvo el status code 201
    And Obtengo una entradaHorariaId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>

    Examples:
      | operation | entity | jsonName          | status |
      | PUT       | EDITAR | put_EditarEntrada | 200    |

  @Eliminar
  Scenario Outline: Eliminar una entrada
    And Con una cuenta creada en Clockify y X-Api-Key
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'get_Workspaces' and ''
    And se obtuvo el status code 200
    And Obtengo un workspaceid valido
    And Obtengo una entradaHorariaId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>

    Examples:
      | operation | entity   | jsonName               | status |
      | DELETE    | ELIMINAR | delete_EliminarEntrada | 204    |