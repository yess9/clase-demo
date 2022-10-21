Feature: Registrar categoria

#mi primer comentario
 Scenario Outline: Insertar categoría
  Given cargo el aplicativo visor web
   And inicio sesión con el usuario <usuario> y la clave <clave>
  When ingreso a la ventana registrar categoría
   And escribo la categoría <categoria> y hago clic en el botón Guardar
  Then el aplicativo muestra el mensaje <mensajeEsperado>
  
   Examples:
    |usuario| clave  |categoria| mensajeEsperado                                       |
    |"admin"| "clave"|"MOUSEPAD"| "Se guardó de manera correcta la Categoría"           |
    |"admin"| "clave"|""       | "Nombre: Error de validación: se necesita un valor." | 
    |"admin"| "clave"|"CARGADOR"  | "Se guardó de manera correcta la Categoría"           |