@Clockify
Feature: Como usuario de Clockify quiero interactuar con la API

  @WS @Workspaces @201 @Exitosos
  Scenario Outline: Traer todos mis Workspaces
    Given Con una cuenta creada en Clockify y X-Api-Key '<token>' generados
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    Then Obtengo los datos de mi Workspace

    Examples:
      | operation | entity    | jsonName         | statusCode | token                                           |
      | GET       | WORKSPACE | traerWorkspaces | 200        | NTZmYjBlY2QtYzQ5ZS00YTYxLWE3ZjQtZWEwYzZjMTA5MWI5 |

  @WS @WorkspacesErrorToken @401 @Error
  Scenario Outline: Error en el token
    Given Con una cuenta creada en Clockify y X-Api-Key '<token>' generados
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained

    Examples:
      | operation | entity    | jsonName        | statusCode | token   |
      | GET       | WORKSPACE | traerWorkspaces | 401        | notoken |

  @WS @WorkspacesErrorEndpoint @404 @Error
  Scenario Outline: Error en endpoint
    Given Con una cuenta creada en Clockify y X-Api-Key '<token>' generados
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained

    Examples:
      | operation | entity    | jsonName              | statusCode | token                                            |
      | GET       | WORKSPACE | Errores/workspaces404 | 404        | NTZmYjBlY2QtYzQ5ZS00YTYxLWE3ZjQtZWEwYzZjMTA5MWI5 |

  @CP @CrearProyecto @201 @Exitosos
  Scenario Outline: Crear un proyecto exitosamente
    Given Con una cuenta creada en Clockify y X-Api-Key 'NTZmYjBlY2QtYzQ5ZS00YTYxLWE3ZjQtZWEwYzZjMTA5MWI5' generados
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'traerWorkspaces' and ''
    And status code 200 is obtained
    And Se crea el nombre del proyecto <name>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And Validacion del proyecto <name>

    Examples:
      | operation | entity  | jsonName      | statusCode | name         |
      | POST      | PROJECT | crearProyecto | 201        | ProyectoTest |

  @CP @CrearProyectoDuplicado @400 @Error
  Scenario Outline: Crear un proyecto exitosamente
    Given Con una cuenta creada en Clockify y X-Api-Key 'NTZmYjBlY2QtYzQ5ZS00YTYxLWE3ZjQtZWEwYzZjMTA5MWI5' generados
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'traerWorkspaces' and ''
    And status code 200 is obtained
    And Se crea el nombre del proyecto <name>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained

    Examples:
      | operation | entity  | jsonName      | statusCode | name              |
      | POST      | PROJECT | crearProyecto | 400        | ProyectoDuplicado |

  @CC @CrearCliente @201 @Exitosos
  Scenario Outline: Crear un cliente exitosamente
    Given Con una cuenta creada en Clockify y X-Api-Key 'NTZmYjBlY2QtYzQ5ZS00YTYxLWE3ZjQtZWEwYzZjMTA5MWI5' generados
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'traerWorkspaces' and ''
    And status code 200 is obtained
    And obtengo un workspaceId
    And tengo un nombre de cliente <name>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And Validacion del cliente <name>

    Examples:
      | operation | entity | jsonName       | statusCode | name        |
      | POST      | CLIENT | agregarCliente | 201        | TestCliente |

  @CC @CrearClienteDuplicado @400 @Error
  Scenario Outline: Crear un cliente exitosamente
    Given Con una cuenta creada en Clockify y X-Api-Key 'NTZmYjBlY2QtYzQ5ZS00YTYxLWE3ZjQtZWEwYzZjMTA5MWI5' generados
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'traerWorkspaces' and ''
    And status code 200 is obtained
    And obtengo un workspaceId
    And tengo un nombre de cliente <name>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained

    Examples:
      | operation | entity | jsonName       | statusCode | name             |
      | POST      | CLIENT | agregarCliente | 400        | ClienteDuplicado |







