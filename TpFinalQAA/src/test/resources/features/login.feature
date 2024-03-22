# language: es


Característica: Login

  @LOG-0001
  Escenario: Login válido
    Dado que el usuario ingresa a la página de login
    Cuando el usuario se loguea con credenciales validas
    Entonces el usuario se encuentra en su cuenta

  @LOG-0002
  Escenario: Login Inválido
    Dado que el usuario ingresa a la página de login
    Cuando el usuario se loguea con credenciales invalidas
    Entonces se muestra mensaje de error credenciales
