# Contratos de API REST

<br>
## Metodo GET usuario
<br>


### Obtendremos todos los usuarios
<br>
GET : v0/usuarios
<b>Request:</b>
{

}

A continuación se muestra un ejemplo de response
<b>Response: </b>
usuarios
{
  "usuarioId" : "1",
  "idTypeUsuario" : "admin",
  "usuarioEmail" : "admin@gmail.com",
  "usuarioName" : "Administrador",
  "usuarioPassword" : "Abejita123456*",
  "creationDate" : "11-02-11 16:47:35,985 +0000",
  "updateDate" : "11-02-11 16:47:35,985 +0000"
}
<b>Codigo de respuesta: </b>  200
<br>
### Metodo POST Crear usuario
<br>
<b>Request:</b>
{
  "usuarioId" : "1",
  "idTypeUsuario" : "admin",
  "usuarioEmail" : "admin@gmail.com",
  "usuarioName" : "Administrador",
  "usuarioPassword" : "Abejita123456*",
  "creationDate" : "11-02-11 16:47:35,985 +0000",
  "updateDate" : "11-02-11 16:47:35,985 +0000"
}
<b>Response: </b>
Usuario creado Exitosamente
{
  "usuarioId" : "1",
  "idTypeUsuario" : "admin",
  "usuarioEmail" : "admin@gmail.com",
  "usuarioName" : "Administrador",
  "usuarioPassword" : "Abejita123456*",
  "creationDate" : "11-02-11 16:47:35,985 +0000",
  "updateDate" : "11-02-11 16:47:35,985 +0000"
}
<b>Codigo de respuesta: </b>  200 : Usuario creado exitosamente<br> 
<b>Codigo de respuesta: </b>  400 : Usuario Ya existente<br>
<b>Codigo de respuesta: </b>  401 : No tiene todos los campos necesarios<br>

