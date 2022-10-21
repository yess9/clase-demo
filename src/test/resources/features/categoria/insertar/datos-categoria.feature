Feature: Registrar Categoria

 Scenario: Insertar categoría exitosa
   Given cargo el aplicativo visor web
    And inicio sesión con el usuario "admin" y la "clave"
    When ingreso a la venta registrar categoria
     And escribo la categoria "cucumber" y hago clic en el botón Guardar
    Then el aplicativo muestra el mensaje "Se guardó de manera correcta la Categoría"
    
    
    Scenario: Insertar categoría con datos vacíos
   Given cargo el aplicativo visor web
    And inicio sesión con el usuario "admin" y la "clave"
    When ingreso a la venta registrar categoría
     And escribo la categoria "" y hago clic en el botón Guardar
    Then el aplicativo muestra el mensaje "Nombre: Error de validación : se necesita un valor."