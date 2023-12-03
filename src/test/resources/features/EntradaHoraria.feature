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
    And Se valida las consultas horarias

    Examples:
      | operation | entity | jsonName             | status |
      | GET       | HORA   | get_EntradasHorarias | 200    |

  @NuevaEntradaHoraria
  Scenario Outline: Agregar una nueva entrada horaria
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
    And Se valida la entrada horaria

    Examples:
      | operation | entity        | jsonName          | status | descripcion | inicio               | fin                  |
      | POST      | NUEVA_ENTRADA | post_NuevaEntrada | 201    | nota        | 2023-12-22T14:27:22Z | 2023-12-27T08:22:27Z |

  @EditarEntradaHoraria
  Scenario Outline: Editar una entrada de horaria
    And Con una cuenta creada en Clockify y X-Api-Key generados
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'get_Workspaces' and ''
    And se obtuvo el status code 200
    And Obtengo un workspaceid valido
    And I perform a 'GET' to 'PROYECTO' endpoint with the 'get_Proyecto' and ''
    And se obtuvo el status code 200
    And Obtengo un proyectoid
    And Agrego una descripcion 'editar nota', una hora de inicio '2023-12-10T14:27:22Z' y una hora de fin '2023-12-17T08:22:27Z'
    And I perform a 'POST' to 'NUEVA_ENTRADA' endpoint with the 'post_NuevaEntrada' and ''
    And se obtuvo el status code 201
    And Obtengo una entradaid
    And Agrego una descripcion '<descripcion>', una hora de inicio '<inicio>' y una hora de fin '<fin>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>
    And Se valida la entrada horaria

    Examples:
      | operation | entity         | jsonName          | status | descripcion | inicio               | fin                  |
      | PUT       | EDITAR_ENTRADA | put_EditarEntrada | 200    | nota nueva  | 2023-12-13T14:27:22Z | 2023-12-25T08:22:27Z |

  @EliminarEntradaHoraria
  Scenario Outline: Eliminar una entrada de horaria
    And Con una cuenta creada en Clockify y X-Api-Key generados
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'get_Workspaces' and ''
    And se obtuvo el status code 200
    And Obtengo un workspaceid valido
    And I perform a 'GET' to 'PROYECTO' endpoint with the 'get_Proyecto' and ''
    And se obtuvo el status code 200
    And Obtengo un proyectoid
    And Agrego una descripcion 'eliminar nota', una hora de inicio '2023-12-10T14:27:22Z' y una hora de fin '2023-12-17T08:22:27Z'
    And I perform a 'POST' to 'NUEVA_ENTRADA' endpoint with the 'post_NuevaEntrada' and ''
    And se obtuvo el status code 201
    And Obtengo una entradaid
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>

    Examples:
      | operation | entity           | jsonName               | status |
      | DELETE    | ELIMINAR_ENTRADA | delete_EliminarEntrada | 204    |