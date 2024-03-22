# language: es


Característica: Pagina de Registro

  @REG-0001
  Escenario: Crear Nueva Cuenta
    Dado que el usuario ingresa a la página de registro
    Cuando el usuario ingresa su informacion
    Entonces se muestra mensaje de cuenta creada


  @REG-0002
  Escenario: Crear Nueva Cuenta Incompleto
    Dado que el usuario ingresa a la página de registro
    Cuando el usuario ingresa su informacion incompleta
    Entonces se muestra mensaje de formulario incompleto